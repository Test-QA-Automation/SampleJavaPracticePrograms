public class RemoveSpecifiedElementFromAnArray
{
    public static void main(String[] args)
    {
        int[] a = {2, 2, 3, 4, 2, 6, 8};
        int val = 2;

        int newLength = removeElement(a, val);
        System.out.println("Length after removing : " + newLength);
    }

    public static int removeElement(int[] nums, int val)
    {
        int index = 0;                                                                              // pointer for new array length

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != val)
            {
                nums[index] = nums[i];                                                              // keep only non-val elements
                index++;
            }
        }
        return index;                                                                               // new length
    }
}
