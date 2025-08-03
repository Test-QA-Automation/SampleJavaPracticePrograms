import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromStringKeepingOrder
{
    public static void main (String args[])
    {
        System.out.println(RemoveDuplicatesKeepingOrder(""));
    }

    public static String RemoveDuplicatesKeepingOrder(String aWord)
    {
        if (aWord.length()==1 || aWord == null || aWord.isEmpty())
        {
            return aWord;
        }
        else
        {
            Set<Character> uniqueChars = new LinkedHashSet<>();
            StringBuilder resultWord = new StringBuilder();

            for (Character c : aWord.toCharArray())
            {
                if (uniqueChars.add(c))
                {
                    resultWord.append(c);
                }
            }

            return resultWord.toString();
        }
    }
}
