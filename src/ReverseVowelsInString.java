public class ReverseVowelsInString
{
    public static void main(String[] args)
    {
        String s = "12Hello354";
        String vowel = "aeiouAEIOU";
        char[] sArray = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        while (left < right)
        {
            if (vowel.indexOf(sArray[left]) == -1)
            {
                left++;
            }
            else if (vowel.indexOf(sArray[right]) == -1)
            {
                right--;
            }
            else
            {
                char temp = sArray[left];
                sArray[left] = sArray[right];
                sArray[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println("Output is : " + new String(sArray));
    }
}
