public class FindOccurenceOfSubStringWithinString
{
    public static void main(String[] args)
    {
        String word = "ABCEDTGJLLABCDSWQABC";
        String subString = "ABC";
        System.out.println("Occurrences of " + subString + " inside " + word + " is : " + getOccurence(word,subString));
    }

    private static int getOccurence(String str, String subString)
    {
        int index = 0;
        int occurence = 0;

        while ((index = str.indexOf(subString, index)) != -1)
        {
            occurence++;
            index += subString.length();
        }

        return occurence;
    }
}
