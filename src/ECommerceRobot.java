import java.util.Arrays;

public class ECommerceRobot
{

    public static void main(String[] args)
    {
        int[] packages = {1, 2, 3};
        System.out.println(minTime(packages)); // Output: 48
    }

    public static long minTime(int[] packages)
    {
        int n = packages.length;
        Arrays.sort(packages);

        long totalTime = 0;
        long currentBinTime = 0;

        for (int i = 0; i < n; i++) {
            currentBinTime += packages[i];   //1 3 6
            totalTime += currentBinTime;     //1 4 10
        }

        return totalTime - packages[n - 1];
    }

}