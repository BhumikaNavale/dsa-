import java.util.*;
public class hashing1
{
    public static void main(String args[])
    {
        HashMap<String,Integer> map=new HashMap<>();

        map.put("india",130);
        map.put("chaina",150);
        map.put("us",90);

        System.out.println(map);

        System.out.println("updata value");
        map.put("chaina",145);
        System.out.println(map);

        if(map.containsKey("chaina"))
        {
            System.out.println("key is present");
        }
        else{
            System.out.print("not present");
        }

        System.out.println(map.get("chaina"));
        System.out.println(map.get("indonatia"));
    
        Set<String> keys=map.keySet();
        for(String key:keys)
        {
            System.out.println(key+" "+map.get(key));
        }
    
    //remove key
    map.remove("chaina");
    System.out.println(map);
    }
}