// An electric appliance shop assigns code 1 to motor,2 to fan,3 to tube and 4 for
// wires. All other items have code 5 or more. While selling the goods, a sales
// tax of 8% to motor,12% to fan,5% to tube light,7.5% to wires and 3% for all
// other items is charged. A list containing the product code and price in two
// different arrays. Write a java program using switch statement to prepare the
// bill.

import java.net.Socket;

public class exp1_5 {
    public static void main(String[] args) {
        int[] productCode = {1, 2, 3, 4, 5};
        double[] prices = {1000,500,300,200,150};

        double totalBill = 0.0;

        System.out.println("Product Code | Price | Sales Tax | Total Price");
        System.out.println("--------------------------------------------");

        for (int i = 0; i < productCode.length; i++) {
            int code = productCode[i];
            double price = prices[i];
            double taxRate = 0.0;
            
            
            switch (code) {
                case 1:
                    taxRate = 0.08; 
                    break;
                case 2:
                    taxRate = 0.12; 
                    break;
                case 3:
                    taxRate = 0.05; 
                    break;
                case 4:
                    taxRate = 0.075; 
                    break;
                default:
                    taxRate = 0.03;
                    break;
            }
            
            
            double salesTax = price * taxRate;
            double totalPrice = price + salesTax;
            
            
            System.out.printf("%12d | %5.2f | %9.2f | %11.2f\n", code, price, salesTax, totalPrice);
            
        
            totalBill += totalPrice;
        }
        
        System.out.println("--------------------------------------------");
        System.out.printf("Total Bill: %.2f\n", totalBill);
        System.out.println("23CS095");
    }
}
