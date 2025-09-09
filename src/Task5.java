import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variables
        double degreesF;
        double degreesC;

        //Outputs
        System.out.println("Please enter the degrees in fahrenheit: ");
        degreesF = scan.nextInt();
        degreesC = (degreesF - 32.0) * (5.0 /9.0);
        System.out.println(degreesF + "°F converted to celsius is " + degreesC + "°C!");
    }
}
