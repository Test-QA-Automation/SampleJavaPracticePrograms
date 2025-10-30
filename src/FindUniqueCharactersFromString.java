import java.util.HashSet;
import java.util.Set;

public class FindUniqueCharactersFromString
{
    public static void main(String[] args)
    {
        String inputString = "rtrrutwe";
        Set<Character> uniqueChars = findUniqueCharacters(inputString);
        System.out.println("Unique Characters=" + uniqueChars);
    }

    public static Set<Character> findUniqueCharacters(String str)
    {
        Set<Character> seenCharacters = new HashSet<>();
        Set<Character> uniqueCharacters = new HashSet<>();

        for (char c : str.toCharArray())
        {
            if (seenCharacters.add(c))                                 // If add returns false, character was already present
            {
//                uniqueCharacters.remove(c);                             // Remove from unique if it's a duplicate
                uniqueCharacters.add(c);
            }
            else
            {
//                uniqueCharacters.add(c);                                // Add to unique if it's the first time seeing it
                uniqueCharacters.remove(c);
            }
        }
        return uniqueCharacters;
    }
}
