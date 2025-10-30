public class ReverseString
{
    public static void main(String[] args)

    {
        String originalString = "Hello Java";

        // Create a StringBuilder object with the original string
        StringBuilder stringBuilder = new StringBuilder(originalString);

        // Use the reverse() method of StringBuilder to reverse the string
        stringBuilder.reverse();

        // Convert the reversed StringBuilder back to a String
        String reversedString = stringBuilder.toString();

        // Print the original and reversed strings
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }
}
