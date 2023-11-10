package question2;

import java.util.Scanner;

/*
Question – 2
    Write a program to implement the concept to access vehicle and car details after getting the
    information from the user(about car details in run-time) and display only the necessary record
    about the car brand, model, availability of it. Print only the necessary details like the output
    example given
 */
abstract class Vehicle {
    void printInfo() {
        System.out.println("Vehicle Details");
    }
    abstract void vehicleInfo();
    }

class Car extends Vehicle {
    String brand;
    String model;
    String price;
    String availability;

    /*
     * Name: vehicleInfo
     * Param: none
     * Return: void
     * Description: Gets the vehicle info from the user and stores it in the class variables
     */
    public void vehicleInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter car brand: ");
        this.brand = sc.nextLine();
        System.out.println("Enter car model: ");
        this.model = sc.nextLine();
        System.out.println("Enter car price: ");
        this.price = sc.nextLine();
        System.out.println("Enter car availability: ");
        this.availability = sc.nextLine();
        sc.close();
    }

    /*
     * Name: printInfo
     * Param: none
     * Return: void
     * Description: Prints the vehicle info
     */
    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Car brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Availability: " + this.availability);
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.vehicleInfo();
        System.out.println();
        car.printInfo();
    }

}