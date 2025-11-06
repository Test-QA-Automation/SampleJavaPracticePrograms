import java.util.LinkedHashSet;
import java.util.Set;

public class FindCharacterOccurences
{
    public static void main(String[] args)
    {
        findOccurances("",'a');
        findOccurances("aaabbbcccdddaa");
    }

    private static void findOccurances(String aString, char aCharToFind)
    {
        if (aString == null)
        {
            System.out.println("null value !");
        }
        else if (aString.isEmpty())
        {
            System.out.println("Given string is empty !");
        }
        else if (aString.length() == 1)
        {
            System.out.println("Given String is single character !");
        }
        else
        {
            int occurence = 0;

            for (char c : aString.toCharArray())
            {
                if (c == aCharToFind)
                {
                    occurence = occurence + 1;
                }
            }

            System.out.println("Occurrences of a character '" + aCharToFind + "' in given string '" + aString + "' is : " + occurence);
        }
    }

    private static void findOccurances(String aString)
    {
        Set<Character> uniquChar = new LinkedHashSet<>();
        StringBuilder aWord = new StringBuilder();

        for (Character a : aString.toCharArray())
        {
            if (uniquChar.add(a))
            {
                aWord.append(a);
            }
        }

        for (Character a : aWord.toString().toCharArray())
        {
            int occurence = 0;

            for (char c : aString.toCharArray())
            {
                if (c == a)
                {
                    occurence = occurence + 1;
                }
            }

            System.out.println("Occurrences of a character '" + a + "' in given string '" + aString + "' is : " + occurence);
        }
    }
}