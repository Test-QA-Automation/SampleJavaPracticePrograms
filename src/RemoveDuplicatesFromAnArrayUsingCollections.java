import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromAnArrayUsingCollections
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        // Using LinkedHashSet to maintain insertion order
        Set<Integer> uniqueSet = new LinkedHashSet<>();

        for (int num : arr)
        {
            uniqueSet.add(num);
        }

        // Convert set back to array (optional)
        int[] result = new int[uniqueSet.size()];
        int index = 0;

        for (int num : uniqueSet)
        {
            result[index++] = num;
        }

        // Print result
        System.out.println("Array after removing duplicates:");

        for (int num : result)
        {
            System.out.print(num + " ");
        }
    }
}
