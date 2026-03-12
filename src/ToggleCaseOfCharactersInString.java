public class ToggleCaseOfCharactersInString
{
    public static void main(String[] args)
    {
        String word = "I Am Bad Boy";
        System.out.println("Initial string is : " + word);
        System.out.println("After toggling case of characters within string is : " + getToggleCaseOfCharsInString(word));
    }

    private static String getToggleCaseOfCharsInString(String str)
    {
        StringBuilder result = new StringBuilder();
        char[] strArray = str.toCharArray();

        for (char c : strArray)
        {
            if (Character.isUpperCase(c))
            {
                result.append(Character.toLowerCase(c));
            }
            else if (Character.isLowerCase(c))
            {
                result.append(Character.toUpperCase(c));
            }
            else
            {
                result.append(c);
            }
        }

        return result.toString();
    }
}
