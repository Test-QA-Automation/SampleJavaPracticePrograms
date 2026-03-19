package WhatWillBeTheOutput;

import java.util.ArrayList;
import java.util.List;

public class WhatWillBeTheOutput9
{
    //output : [A, C]
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>(List.of("A", "B", "C"));

        for (String s : list)
        {
            if (s.equals("B"))
            {
                list.remove(s);
            }
        }
        System.out.println(list);
    }
}
