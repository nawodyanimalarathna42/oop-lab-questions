/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author wrs
 */
public class DeliveryChargeCalculator {

    // Rates as per requirements
    private final double DISTANCE_RATE = 100.0;
    private final double WEIGHT_RATE = 50.0;
    private final double EXPRESS_FEE = 500.0;

    // 1. Only base charge
    public double calculateCharge(double baseCharge) {
        return baseCharge;
    }

    // 2. Base charge + distance
    public double calculateCharge(double baseCharge, double distanceKm) {
        return baseCharge + (distanceKm * DISTANCE_RATE);
    }

    // 3. Base charge + distance + weight
    public double calculateCharge(double baseCharge, double distanceKm, double weightKg) {
        return baseCharge + (distanceKm * DISTANCE_RATE) + (weightKg * WEIGHT_RATE);
    }

    // 4. Base charge + optional express delivery
    public double calculateCharge(double baseCharge, boolean expressDelivery) {
        if (expressDelivery) {
            return baseCharge + EXPRESS_FEE;
        }
        return baseCharge;
    }
}
