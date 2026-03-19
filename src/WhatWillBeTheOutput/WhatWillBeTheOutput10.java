package WhatWillBeTheOutput;

import java.util.HashMap;
import java.util.Map;

public class WhatWillBeTheOutput10
{
    public static void main(String[] args)
    {
        //output : 3 and B
        Map<String, String> map = new HashMap<>();

        map.put(null, "A");
        map.put(null, "B");
        map.put("X", null);
        map.put("Y", null);

        System.out.println(map.size());
        System.out.println(map.get(null));
    }
}
