public class RemoveSpCharFromString
{
    public static void main(String[] args)
    {
        String str = "@!#r@vi567 kum@)(*ar1234";
        String result = removeSpecialCharacters(str);
        System.out.println("Original String: " + str);
        System.out.println("String after removing special characters: " + result);
    }

    public static String removeSpecialCharacters(String str)
    {
        StringBuilder cleanedString = new StringBuilder();
        int sum = 0;

        for (char ch : str.toCharArray())
        {
            if (Character.isLetter(ch) || Character.isWhitespace(ch))
            {
                cleanedString.append(ch);
            }
            else if (Character.isDigit(ch))
            {
                sum += Character.getNumericValue(ch);
            }
        }

        return cleanedString.append(" ").append(sum).toString().trim();
    }
}
