import java.util.*;

public class LargeNumberFromAnArray
{
    public static void main (String[] args)
    {
        Integer[] array = {1, 2, 22, 33, 4, 5};
        largestNumber(array);
        lastAndSecondLargeNumber(array);
        lastAndSecondLowestNumber(array);
        secondLargestNumberWithoutSorting(array);

    }

    public static void largestNumber(Integer[] anArray)
    {

        int largestNumber = anArray[0];

        for (int number : anArray)
        {
            if (number > largestNumber)
            {
                largestNumber = number;
            }
        }

        System.out.println(largestNumber);
    }

    public static void lastAndSecondLargeNumber(Integer[] anArray)
    {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(anArray));

        Collections.sort(numbers);
        System.out.println(numbers);

        System.out.println("Largest Number from given list is -> " +
                numbers.get(numbers.size() - 1));

        System.out.println("Second largest Number from given list is -> " +
                numbers.get(numbers.size() - 2));
    }

    public static void lastAndSecondLowestNumber(Integer[] anArray)
    {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(anArray));

        numbers.sort(Collections.reverseOrder());
        System.out.println(numbers);

        System.out.println("Lowest Number from given list is -> " +
                numbers.get(numbers.size() - 1));

        System.out.println("Second lowest Number from given list is -> " +
                numbers.get(numbers.size() - 2));
    }

    public static void secondLargestNumberWithoutSorting(Integer[] anArray)
    {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : anArray)
        {
            if (number > largest)
            {
                secondLargest = largest;
                largest = number;
            }
            else if (number > secondLargest && number != largest)
            {
                secondLargest = number;
            }
        }

        if (secondLargest == Integer.MIN_VALUE)
        {
            System.out.println("No distinct second largest element found (all elements might be same).");
        }

        System.out.println("Second largest number is : " + secondLargest);

    }
}
