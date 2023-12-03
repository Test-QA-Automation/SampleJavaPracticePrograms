public class FindCharacterOccurences
{
    public static void main(String[] args)
    {
        findOccurances("",'a');
    }

    public static void findOccurances(String aString, char aCharToFind)
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
}