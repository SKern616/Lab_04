public class Task4 {
    public static void main(String[] args) {

        //Variables
        double intCardBalance = 5000;
        double newCardBalance;
        double INTEREST_RATE = 0.17;

        System.out.println("Your initial card balance is: $" + intCardBalance);
        newCardBalance = intCardBalance + (intCardBalance * INTEREST_RATE);
        System.out.println("Your total card balance after one month is: $" + newCardBalance);
        newCardBalance += newCardBalance * INTEREST_RATE;
        System.out.println("Your total card balance after two months is: $" + newCardBalance);
    }
}
