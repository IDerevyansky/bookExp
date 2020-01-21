package learn_Java;

import learn_Java.car.Car;

public class App {
	static Car toyota = new Car();
	static String name = toyota.name("Toyota");
	static int speed = toyota.speed(210);
	static int seats = toyota.HowMuchSeats(4);
	
	public static void main(String[] args){
		System.out.println("name a car: "+name+" speed the car: "+speed+" seats for the car: "+ seats);
	}
	
}