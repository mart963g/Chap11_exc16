package Exc_16;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exc_16
{
    public static void main(String[] args)
    {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Martin",123);
        map.put("Sebastian",123);
        map.put("Troels",567);
        map.put("Pieler",234);
        map.put("Christian",345);
        System.out.println(map);
        System.out.println(is1to1(map));
    }

    public static boolean is1to1(Map<String,Integer> map)
    {
        boolean res = true;
        Set<Integer> set = new HashSet<>();
        set.addAll(map.values());
        if(set.size()<map.keySet().size())
        {
            res = false;
        }
        return res;
    }

}
