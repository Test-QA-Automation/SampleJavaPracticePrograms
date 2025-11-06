import java.util.Scanner;

public class FactorialByRecursiveFunction
{
    public static void main(String[] args)
    {
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println("Factorial of " + num +" is : " + factorialOfNumberRecursion(num));
        System.out.println("Factorial of " + num +" is : " + factorialOfNumber(num));
    }

    private static int factorialOfNumberRecursion(int number)
    {
        if (number == 0 || number == 1)
        {
            return 1;
        }
        // Recursive case: n * factorial(n-1)
        else
        {
            return number * factorialOfNumberRecursion(number - 1);
        }
    }

    private static int factorialOfNumber(int number)
    {
        int factorial = 1;

        if (number == 0 || number == 1)
        {
            return 1;
        }
        // Recursive case: n * factorial(n-1)
        else
        {
            for (int i=1; i <= number;i++)
            {
                factorial *= i;
            }
        }

        return factorial;
    }
}
