import java.util.Scanner;

public class Percentages2
{
    public static void main(String[] args)
    {
        double a = getNumber();
        double b = getNumber();

        computePercent(a, b);
        computePercent(b, a);
    }

    private static double getNumber()
    {
        double number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        number = input.nextDouble();
        return number;
    }

    private static void computePercent(double a, double b)
    {
        double percent = (a / b * 100);
        System.out.println(a + " is " + percent + " percent of " + b);
    }
}
