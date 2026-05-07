/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author wrs
 */
public class Main {
    public static void main(String[] args) {
        
        Car myCar = new Car("CAD-1234", "Toyota", 5, 5000.0);
        myCar.displayVehicleInfo();
        double carCost = myCar.calculateRentalCost();
        System.out.println("Total Rental Cost for Car: " + carCost);
        
        System.out.println();

        Bike myBike = new Bike("B-9988", "Yamaha", 10, 200.0);
        myBike.displayVehicleInfo();
        double bikeCost = myBike.calculateRentalCost();
        System.out.println("Total Rental Cost for Bike: " + bikeCost);
        
    }
}