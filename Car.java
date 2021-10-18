class Car {

	String color="grey";
	String name="volta";
	int numberPlate=007;

	void changeColor(String newColor){
		System.out.println("The old color of the car is "+color);
		color=newColor;
		System.out.println("The new color of the car is "+color);
	}

	void changeName(String newName){
		System.out.println("the old name of the car is "+name);
		name=newName;
		System.out.println("the new name of the car is "+name);
	}

	void changeNumberPlate(int newNumberPlate){
		System.out.println("the old number plate is "+numberPlate);
		numberPlate=newNumberPlate;
		System.out.println("the new number plate is "+numberPlate);
	}

	public static void main(String[] args){
		Car car = new Car();
		car.changeName("spark");
		car.changeColor("blue");
		car.changeNumberPlate(214);
	}
}
