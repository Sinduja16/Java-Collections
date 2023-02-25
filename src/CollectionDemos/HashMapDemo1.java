package CollectionDemos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {
    public static void main(String []args){
       // HashMap m = new HashMap();
        HashMap <Integer, String>  m = new <Integer, String> HashMap();

        m.put(101,"John");
        m.put(102,"David");
        m.put(103,"Scott");
        m.put(104,"Mary");
        m.put(105,"Tye");
        m.put(103,"X");
        m.put(106,"David");

        System.out.println(m);

        //print the value
        System.out.println(m.get(105));

        //remove pair from hashmap
        System.out.println(m.remove(106));

        //contains
        System.out.println(m.containsKey(101));
        System.out.println(m.containsKey(106));

        System.out.println(m.containsValue("Mary"));
        System.out.println(m.containsValue("abd"));

        System.out.println(m.isEmpty());

        //keys only in set
        System.out.println(m.keySet());

        for (Object i : m.keySet()){
            System.out.println(i);
        }

        //return all the values as set
        System.out.println(m.values());

        for (Object j : m.values()){
            System.out.println(j);
        }

        //return as set
        System.out.println(m.entrySet());

        for (Object k : m.entrySet()){
            System.out.println(k);
        }
        //Entry methods
        for(Map.Entry entry : m.entrySet()){

            System.out.println(entry.getKey() +" " + entry.getValue());

        }

        //iterator()

        Set s =m.entrySet();

        Iterator it = s.iterator();
                while (it.hasNext()){
                   Map.Entry ent =(Map.Entry) it.next();
                   System.out.println(ent.getKey() + " " + ent.getValue());
                }







    }
}
