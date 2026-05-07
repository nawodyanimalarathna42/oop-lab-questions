/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author wrs
 */
class Car extends Vehicle {
    private int numberOfDays;
    private double dailyRate;

    public Car(String vehicleNumber, String brand, int numberOfDays, double dailyRate) {
        super(vehicleNumber, brand); // Initialize parent attributes
        this.numberOfDays = numberOfDays;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateRentalCost() {
        super.calculateRentalCost(); // Call parent method first
        return numberOfDays * dailyRate;
    }
}