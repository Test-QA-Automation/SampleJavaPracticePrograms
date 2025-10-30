public class StarPattern
{
    // Sample comments to pull from git
    public static void main(String[] args)
    {
// Star Pattern logic - forward
//		*
//		**
//		***
//		****
//		*****

        int rowCount = 5;

        for (int i=0; i<rowCount; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

// Star Pattern logic - reverse

        for (int i=0; i<rowCount; i++)
        {
            for (int j=rowCount-1; j>=i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
