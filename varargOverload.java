class varargOverload{

static void methodOverload(boolean a, int b, int c){
if(a){
System.out.println("---------Inside the method overload---------\n");
}
} 

static void methodOverload(boolean a, int... list){
if(a){
System.out.println("---------Inside the method overload with varargs : "+ list.length);
} 
}

public static void main(String[] args){

varargOverload vO = new varargOverload();
vO.methodOverload(false, 2, 4);
vO.methodOverload(true, 1, 2, 3, 4, 5, 6, 7);
vO.methodOverload(true);


}
}