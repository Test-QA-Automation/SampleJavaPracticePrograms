import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReturnDuplicatesValuePairsFromMap
{
    public static void main(String[] args)
    {
        // Example map with duplicate values
        Map<String, String> map = new HashMap<>();
        map.put("A", "Apple");
        map.put("B", "Banana");
        map.put("C", "Apple");
        map.put("D", "Orange");
        map.put("E", "Banana");
        map.put("F", "Grapes");

        // Find and print key-value pairs with duplicate values
        List<Map.Entry<String, String>> duplicates = findDuplicateValues(map);
        System.out.println("Key-Value pairs with duplicate values: " + duplicates);
    }

    // Function to find key-value pairs with duplicate values in a map
    private static List<Map.Entry<String, String>> findDuplicateValues(Map<String, String> map)
    {
        // Create a HashMap to store the occurrences of each value
        Map<String, Integer> valueOccurrences = new HashMap<>();

        // Create a list to store key-value pairs with duplicate values
        List<Map.Entry<String, String>> duplicates = new ArrayList<>();

        // Iterate through the map
        for (Map.Entry<String, String> entry : map.entrySet())
        {
            String value = entry.getValue();

            // Check if the value is already in the occurrences map
            if (valueOccurrences.containsKey(value))
            {
                // Add the key-value pair to the duplicates list
                duplicates.add(entry);
            }
            else
            {
                // Update the occurrences map with the current value
                valueOccurrences.put(value, 1);
            }
        }

        return duplicates;
    }
}
