import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variables
        double springCost;
        double summerCost;
        double fallCost;
        double winterCost;
        double yearlyCost;

        //Outputs
        System.out.println("Please enter the total maintenance cost for Spring: ");
        springCost = scan.nextInt();
        System.out.println("Please enter the total maintenance cost for Summer: ");
        summerCost = scan.nextInt();
        System.out.println("Please enter the total maintenance cost for Fall: ");
        fallCost = scan.nextInt();
        System.out.println("Please enter the total maintenance cost for Winter: ");
        winterCost = scan.nextInt();
        yearlyCost = springCost + summerCost + fallCost + winterCost;
        System.out.println("The total yearly maintenance cost is: $" + yearlyCost);
    }
}
