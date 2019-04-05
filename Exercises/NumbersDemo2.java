import java.util.Scanner;
public class NumbersDemo2
{
    public static void main(String[] args)
    {
        int number1 = getNumber();
        int number2 = getNumber();

        displayTwiceTheNumber(number1);
        displayTwiceTheNumber(number2);
        displayNumberPlusFive(number1);
        displayNumberPlusFive(number2);
        displayNumberSquared(number1);
        displayNumberSquared(number2);
    }

    private static int getNumber()
    {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();
        return number;
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
