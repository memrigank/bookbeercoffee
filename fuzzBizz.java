public class fuzzBizz{

public static void main(String[] args){

for(int i=1; i<=100; i++){

int a = i%3;
int b = i%5;
if((a==0) && (b!=0)){
System.out.println("\n");
System.out.println("fizz");
}
else if((b==0) && (a!=0)){
System.out.println("\n");
System.out.println("buzz");
}
else if((a==0) && (b==0)){
System.out.println("\n");
System.out.println("fizz buzz");
}
else{
System.out.println("\n");
System.out.println(i);
}
}
}
}