class overloading{

static void add(int a, int b){
System.out.println(a+b);
}

static void add(double a, double b){
System.out.println(a+b);
}

static void add(float a, float b){
System.out.println(a+b);
}

public static void main(String[] args)
{
overloading overloading = new overloading();
overloading.add(4,5);
overloading.add(3.2f,6.3f);
overloading.add(3.3,7.1); 

}
}
