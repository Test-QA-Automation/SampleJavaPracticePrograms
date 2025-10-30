public class ReverseOnlyAlphabestInString
{
    public static void main(String[] args)
    {
        String s = "12lena354";
        char[] sArray = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        while (left < right)
        {
            if (Character.isDigit(sArray[left]))
            {
                left++;
            }
            else if (Character.isDigit(sArray[right]))
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
