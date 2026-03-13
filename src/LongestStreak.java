import java.util.Arrays;
import java.util.List;

public class LongestStreak
{
    public static void main(String[] args)
    {
        List<String> logs = Arrays.asList("YNY", "YYY", "YYY", "NYY", "YYY");
        System.out.println("Max Streak for the week is : " + calculateMaxStreak(logs));
    }

    public static int calculateMaxStreak(List<String> weeklogs)
    {
        int maxStreak = 0;
        int currentStreak = 0;

        for (String data : weeklogs)
        {
            if (! data.contains("N"))
            {
                currentStreak++;
                maxStreak = Math.max(maxStreak, currentStreak);
            }
            else
            {
                currentStreak = 0;
            }
        }

        return maxStreak;
    }

}
