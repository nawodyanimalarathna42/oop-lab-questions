/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author wrs
 */
public class ProductBill {
    // Private attributes for storing text values as required
    private String priceText;
    private String quantityText;

    // Constructor to initialize both values
    public ProductBill(String priceText, String quantityText) {
        this.priceText = priceText;
        this.quantityText = quantityText;
    }

    // Method to convert text inputs and calculate total price
    public double calculateTotal() {
        // Convert priceText using Double.parseDouble and quantityText using Integer.parseInt
        double price = Double.parseDouble(priceText);
        int quantity = Integer.parseInt(quantityText);
        
        // Return the product of price and quantity
        return price * quantity; // Do not handle the exception inside this class
    }
}
