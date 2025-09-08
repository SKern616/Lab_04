public class Task1 {
    public static void main(String[] args) {
        // Variables
        int intOperandA = 5;
        int intOperandB = 2;
        int intSum;
        int intDifference;
        int intProduct;
        int intQuotient;
        int intModulo;

        double doubleOperandA = 5.0;
        double doubleOperandB = 2.0;
        double doubleSum;
        double doubleProduct;
        double doubleDifference;
        double doubleQuotient;
        double doubleModulo;

        //Operation assignment
        intSum = intOperandA + intOperandB;
        intDifference = intOperandA - intOperandB;
        intProduct = intOperandA * intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;

        doubleSum = doubleOperandA + doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;
        doubleModulo = doubleOperandA % doubleOperandB;

        //Output
        System.out.println("The sum of " + intOperandA + " and " + intOperandB + " is: " + intSum);
        System.out.println("The difference of " + intOperandA + " and " + intOperandB + " is: " + intDifference);
        System.out.println("The product of " + intOperandA + " and " + intOperandB + " is: " + intProduct);
        System.out.println("The Quotient of " + intOperandA + " and " + intOperandB + " is: " + intQuotient);
        System.out.println("The mod of " + intOperandA + " and " + intOperandB + " is: " + intModulo);

        System.out.println("The sum of " + doubleOperandA + " and " + doubleOperandB + " is: " + doubleSum);
        System.out.println("The difference of " + doubleOperandA + " and " + doubleOperandB + " is: " + doubleDifference);
        System.out.println("The product of " + doubleOperandA + " and " + doubleOperandB + " is: " + doubleProduct);
        System.out.println("The Quotient of " + doubleOperandA + " and " + doubleOperandB + " is: " + doubleQuotient);
        System.out.println("The mod of " + doubleOperandA + " and " + doubleOperandB + " is: " + doubleModulo);

    }
}
