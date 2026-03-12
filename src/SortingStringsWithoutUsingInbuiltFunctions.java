import java.util.Arrays;

public class SortingStringsWithoutUsingInbuiltFunctions
{
    public static void main(String[] args)
    {
        String[] fruits = {"mango", "apple", "orange", "dates", "grapes"};
        System.out.println(Arrays.toString(manualSortWithoutUsingInbuiltFunction(fruits)));
    }

    private static String[] manualSortWithoutUsingInbuiltFunction(String[] strArray)
    {
        for (int i=0; i < strArray.length; i++)
        {
            for (int j=i+1; j < strArray.length; j++)
            {
                if (strArray[i].compareTo(strArray[j]) > 0)
                {
                    String temp = strArray[i];
                    strArray[i] = strArray[j];
                    strArray[j] = temp;
                }
            }
        }

        return strArray;
    }
}
