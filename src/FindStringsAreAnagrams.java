import java.util.Arrays;

public class FindStringsAreAnagrams
{
    public static void main(String[] args)
    {
        String s1 = "shanakar";
        String s2 = "karshaan";

        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();

        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        if (Arrays.equals(s1Array, s2Array))
        {
            System.out.println("Given strings are anagrams");
        }
        else
        {
            System.out.println("Given strings are not anagrams");
        }

    }
}
