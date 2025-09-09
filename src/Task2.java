import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variables
        double purchasePrice;
        double totalPrice;
        double SALES_TAX_PERCENTAGE = 0.05;

        //Outputs
        System.out.println("Please enter the price of your purchase: ");
        purchasePrice = scan.nextInt();
        totalPrice = purchasePrice + (purchasePrice * SALES_TAX_PERCENTAGE);
        System.out.println("Your total price is: $" + totalPrice);
    }

}
