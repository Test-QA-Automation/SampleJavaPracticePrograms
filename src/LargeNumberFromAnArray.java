import java.util.*;

public class LargeNumberFromAnArray
{
    public static void main (String[] args)
    {
        Integer[] array = {-1, -2, -3, -5, -7};
        largestNumber(array);
        lastAndSecondLargeNumber(array);

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

    public static void lastAndSecondLargeNumber(Integer anArray[])
    {
        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(anArray));

        Collections.sort(numbers);
        System.out.println(numbers);

        System.out.println("Largest Number from given list is -> " + numbers.get(numbers.size() - 1));
        System.out.println("Second largest Number from given list is -> " + numbers.get(numbers.size() - 2));
    }
}
