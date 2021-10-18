public class learningj{

public static void main(String[] args){

class Car{

String name = "Spark";
String color="grey";

}

Car car = new Car();
String n=car.changeColor("Black");
String ne=car.changeName("Volta");

System.out.println(n);
System.out.println(ne);

}
public static String changeColor(String newColor){
System.out.println(color);
color=newColor;
return color;
}

public static String changeName(String newName){
System.out.println(name);
name = newName;
return name;
}

}