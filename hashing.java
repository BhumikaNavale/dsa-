import java.util.HashSet;
import java.util.Iterator;
public class hashing
{
    public static void main(String args[])
    {
        HashSet<Integer> set=new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        System.out.println(set);
         System.out.println("size of set is="+set.size());
        if(set.contains(1))
        {
            System.out.println("1 is found ");
        }
        if(!set.contains(6)){
            System.out.println("6 does not contain");
        }

        set.remove(1);
        if(!set.contains(1))
        {
            System.out.println("1 does not contains");
        }

        //Iterator conncept
        System.out.println(" *****");

        Iterator it = set.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());//does not need to increment or decrement
        }
      
    }   
}