import java.util.Arrays;

public class FindStringsAreAnagrams
{
    public static void main(String[] args)
    {
        String s1 = "shanakar";
        String s2 = "karshaan";

        System.out.println(isAnagramUsingInBuiltFunction(s1, s2));
        System.out.println(isAnagramUsingStringBuilder(s1, s2));
    }

    public static String isAnagramUsingInBuiltFunction(String s1, String s2)
    {
        char[] s1Array = s1.replaceAll("\\s","").toLowerCase().toCharArray();
        char[] s2Array = s2.replaceAll("\\s","").toLowerCase().toCharArray();

        if (s1Array.length != s2Array.length)
        {
            return "Given strings are anagrams";
        }
        else
        {
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);

            if (Arrays.equals(s1Array, s2Array))
            {
                return "Given strings are anagrams";
            }
            else
            {
                return "Given strings are not anagrams";
            }
        }
    }

    public static String isAnagramUsingStringBuilder(String s1,  String s2)
    {
        char[] s1Array = s1.replaceAll("\\s","").toLowerCase().toCharArray();
        char[] s2Array = s2.replaceAll("\\s","").toLowerCase().toCharArray();

        if (s1Array.length != s2Array.length)
        {
            return "Given strings are anagrams";
        }
        else
        {
            boolean isAnagram = true;
            StringBuilder s2Builder = new StringBuilder(Arrays.toString(s2Array));

            for (char c : s1Array)
            {
                int index = s2Builder.indexOf(String.valueOf(c));
                if (index != -1)
                {
                    s2Builder.deleteCharAt(index);
                }
                else
                {
                    isAnagram = false;
                    break;
                }
            }

            if (isAnagram)
            {
                return "Given strings are anagrams";
            }
            else
            {
                return "Given strings are not anagrams";
            }
        }
    }
}
