import java.util.HashMap;
import java.util.Map;

public class FindCharacterOccurencesUsingMap
{
    public static void main(String[] args) {
        //String myString = "Naveen";
        findOccurrences(null, ' ');
    }

    public static void findOccurrences(String aString, Character aChar) {
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
            Map<Character, Integer> myCharOccurrence = new HashMap<>();
            char[] myArray = aString.toCharArray();

            for (char c : myArray) {
                if (!myCharOccurrence.containsKey(c)) {
                    myCharOccurrence.put(c, 1);
                } else {
                    myCharOccurrence.replace(c, myCharOccurrence.get(c) + 1);
                }
            }

            if (myCharOccurrence.containsKey(aChar)) {
                System.out.println("Occurrences of a character '" + aChar + "' in given string '" + aString + "' is : " + myCharOccurrence.get(aChar));
            } else {
                System.out.println("given character is not available in string, please enter valid value.");
            }
        }
    }
}
