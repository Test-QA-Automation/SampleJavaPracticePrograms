public class StringCompressor
{
    public static void main(String[] args)
    {
        stringCompressor("aaabbbcccddef");
    }

    public static void stringCompressor(String aString)
    {
        StringBuilder aWord = new StringBuilder();
        int count = 1;
        char firstChar = aString.charAt(0);

        for (int i=1; i< aString.length(); i++)
        {
            char nextChar = aString.charAt(i);

            if (nextChar == firstChar)
            {
                count++;
            }
            else
            {
                aWord.append(firstChar).append("-> ").append(count).append(" ");
                count = 1;
                firstChar = nextChar;
            }

            if (i == aString.length() - 1)
            {
                aWord.append(firstChar).append("-> ").append(count).append(" ");
            }
        }

        System.out.println(aWord.toString().trim());

    }
}
