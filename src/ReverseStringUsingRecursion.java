public class ReverseStringUsingRecursion
{
    public static void main(String[] args)
    {
        String str = "Hello, World!";
        System.out.println("Original String: " + str);
        String reversedStr = reverseStringUsingRecursion(str);
        System.out.println("Reversed String: " + reversedStr);
    }

    public static String reverseStringUsingRecursion(String s)
    {
        if (s == null || s.length() <= 1)
        {
            return s;
        }

        return reverseStringUsingRecursion(s.substring(1)) + s.charAt(0);
    }
}
