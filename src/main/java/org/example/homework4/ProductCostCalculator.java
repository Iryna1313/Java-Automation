package org.example.homework4;

import java.util.Scanner;

public class ProductCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter price of one product: ");
        double unitPrice = in.nextDouble();
        System.out.print("Please enter quantity of products: ");
        int quantity = in.nextInt();
        calculateTotalCost(unitPrice,quantity);

        double amountPayable = calculateTotalCost(unitPrice, quantity);
        System.out.println("Payable with a discount: " + amountPayable);
    }

    public static double calculateTotalCost(double unitPrice, int quantity) {
        double discountedAmount = unitPrice * quantity;
        if (quantity > 10 && quantity <= 20) {
            return discountedAmount * 0.95;
        } else if (quantity > 20 && quantity <= 30){
            return discountedAmount * 0.9;
        } else if (quantity > 30 && quantity <= 80){
            double additionalDiscount = discountedAmount * ((quantity - 30) / 10) * 0.004;
            return discountedAmount * 0.88 - additionalDiscount;
        } else if (quantity > 80){
            return discountedAmount * 0.87;
        }
        return discountedAmount;
    }
}
