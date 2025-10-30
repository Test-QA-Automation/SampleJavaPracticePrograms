import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseAlternateStringsInArray
{
    public static void main(String[] args)
    {

        List<String> input= Arrays.asList("one", "two", "three", "four", "five");
        List<String> output = new ArrayList<>();

        for (int i=0; i<input.size(); i++)
        {
            if ((i+1) % 2 == 0)
            {
                String reverseString = new StringBuilder(input.get(i)).reverse().toString();
                output.add(reverseString);
            }
            else
            {
                output.add(input.get(i));
            }
        }

        System.out.println(Arrays.toString(output.toArray()));
    }
}
