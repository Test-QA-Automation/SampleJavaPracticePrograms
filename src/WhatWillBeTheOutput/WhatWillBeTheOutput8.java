package WhatWillBeTheOutput;

public class WhatWillBeTheOutput8
{
    //output : 20       Try bock can be use without catch also after Java 7
    static int WhatWillBeTheOutput8()
    {
        try
        {
            return 10;
        }
        finally
        {
            return 20;
        }
    }

    public static void main(String[] args)
    {
        System.out.println(WhatWillBeTheOutput8());
    }
}
