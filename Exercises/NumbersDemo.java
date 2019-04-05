public class NumbersDemo
{
    public static void main(String[] args)
    {
        int number1 = 7;
        int number2 = 13;
        displayTwiceTheNumber(number1);
        displayTwiceTheNumber(number2);
        displayNumberPlusFive(number1);
        displayNumberPlusFive(number2);
        displayNumberSquared(number1);
        displayNumberSquared(number2);
    }

    private static void displayTwiceTheNumber(int a)
    {
        System.out.println("Twice the number: " + (a * 2));
    }

    private static void displayNumberPlusFive(int a)
    {
        System.out.println("Number plus five: " + (a + 5));
    }

    private static void displayNumberSquared(int a)
    {
        System.out.println("Number squared: " + (a * a));
    }
}
