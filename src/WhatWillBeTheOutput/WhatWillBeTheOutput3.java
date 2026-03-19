package WhatWillBeTheOutput;

public class WhatWillBeTheOutput3
{
    // output : nothing would be displayed
    public static void main(String[] args)
    {
        String s1 = "Test";
        String s2 = new String("Test");

        if (s1 == s2)
        {
            System.out.println("Equal");
        }
    }
}