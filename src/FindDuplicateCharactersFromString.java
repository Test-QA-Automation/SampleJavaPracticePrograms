import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicateCharactersFromString
{
    public static void main(String[] args)
    {
        try (Scanner scanner = new Scanner(System.in))
        {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            Map<Character, Integer> charCountMap = new HashMap<>();

            // Populate the HashMap with character counts
            for (char ch : input.toCharArray())
            {
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }

            System.out.println("Duplicate characters:");

            // Iterate through the map to find and print duplicates
            for (Map.Entry<Character, Integer> entry : charCountMap.entrySet())
            {
                if (entry.getValue() > 1)
                {
                    System.out.println("'" + entry.getKey() + "' appears " + entry.getValue() + " times.");
                }
            }
        }
    }
}
