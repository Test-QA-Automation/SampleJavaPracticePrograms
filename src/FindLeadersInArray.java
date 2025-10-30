public class FindLeadersInArray
{
    public static void main (String[] args)
    {
        int[] array = {2,4,6,3,1,2};
        findLeadersScanFromRight(array);
        findLeadersScanFromLeft(array);
    }

//    Approach : Scan from Right
    public static void findLeadersScanFromRight(int[] array)
    {
        int max = 0;

        for (int i=array.length - 1; i>=0; i--)
        {
            if (array[i]>max)
            {
                System.out.println(array[i]);
                max = array[i];
            }
        }
    }

//        Approach : Scan from Left
    public static void findLeadersScanFromLeft(int[] array)
    {
        int i,j;

        for(i=0; i<array.length; i++)
        {
            for(j=i+1; j< array.length; j++)
            {
                if(array[j] >= array[i])
                    break;
            }

            if(j == array.length)
                System.out.println(array[i]);
        }
    }
}
