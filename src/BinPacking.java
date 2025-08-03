import java.util.Arrays;

public class BinPacking {

    public static long minTimeToRemovePackages(int[] packages)
    {
        int n = packages.length;
        long totalTime = 0;
        int maxPackages = Integer.MIN_VALUE;

        // Find the maximum number of packages in any bin
        for (int i = 0; i < n; i++)
        {
            maxPackages = Math.max(maxPackages, packages[i]);
        }

        // Iterate from the last bin to the first bin
        for (int i = n - 1; i >= 0; i--)
        {
            // Calculate the time needed to move to the current bin and back
            long moveTime = i + 1;

            // Calculate the time needed to load packages from bins between the current bin and the last bin
            long loadTime = 0;
            for (int j = i + 1; j < n; j++)
            {
                loadTime += packages[j];
            }

            // Update the total time
            totalTime += moveTime + loadTime;

            // If this is not the last bin, subtract the maximum number of packages from this bin
            if (i != n - 1)
            {
                totalTime -= maxPackages;
            }
        }

        return totalTime;
    }

    public static void main(String[] args) {
        int[] packages = {1, 2, 3};
        long minTime = minTimeToRemovePackages(packages);
        System.out.println("Minimum time to remove packages: " + minTime);
    }
}
