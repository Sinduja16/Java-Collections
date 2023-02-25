package CollectionDemos;

import java.util.*;

public class HashTableDemo1 {
    public static void main(String []args){

        //Hashtable t = new Hashtable(); // default capacity is 11, load factor 0.75
        // Hashtable t = new Hashtable(initial capacity, load factor); we can specify the capacity and load factor as well

        Hashtable<Integer, String> t = new <Integer, String> Hashtable();
        t.put(101, "John");
        t.put(102, "David");
        t.put(103, "Smith");
       // t.put(null, "X"); --> Not allowed
       // t.put(105, null); --> Not allowed

        System.out.println(t);

        System.out.println(t.get(103));

        t.remove(103);
        System.out.println(t);

        System.out.println(t.contains(102));
        System.out.println(t.contains(105));


        System.out.println(t.contains("David"));
        System.out.println(t.contains("Y"));

        System.out.println(t.isEmpty());

        System.out.println(t.keySet());
        System.out.println(t.values());


        for(int K : t.keySet()){
            System.out.println(K + " " + t.get(K));

        }

        //Entry specific method
        for (Map.Entry r : t.entrySet()){
            //System.out.println(r);
            System.out.println(r.getKey() + " " + r.getValue());
        }

        //Iterator
        Set s =t.entrySet();

        Iterator itr = s.iterator();
                while(itr.hasNext()){
                    Map.Entry entry = (Map.Entry) itr.next();
                    System.out.println(entry);
                }





    }
}
