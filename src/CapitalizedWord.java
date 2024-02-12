public class CapitalizedWord
{
    public static void main(String[] args)
    {
        capitalizedWord(null);
        capitalizedWord("");
        capitalizedWord("S");
        capitalizedWord("a");
        capitalizedWord("a b c d");
        capitalizedWord("can you test please");
        capitalizedWord("123");
    }

    private static void capitalizedWord(String aString)
    {
        if (aString == null)
        {
            System.out.println("null value");
        }
        else if (aString.isEmpty())
        {
            System.out.println("Given string is empty");
        }
        else if (aString.length() == 1)
        {
            System.out.println(aString.toUpperCase());
        }
        else
        {
            String result = "";

            for (String word : aString.split("\\s"))
            {
                String first = word.substring(0, 1).toUpperCase();
                String rest = word.substring(1, word.length());

                result = result + first + rest + " ";
            }

            System.out.println(result.trim());
        }
    }
}