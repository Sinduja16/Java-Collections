package CollectionDemos;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
    public static void main(String []args){

        //declare
        HashSet hs = new HashSet(); //default capacity local factor 0.75

        // HashSet hs = new HashSet(100,(float)0.90);
        //HashSet <Integer> hs = new HashSet <Integer>();

        //Add values
        hs.add(100);
        hs.add("welcome");
        hs.add(16.4);
        hs.add('A');
        hs.add(true);
        hs.add(null);

        System.out.println(hs);

        //remove
        hs.remove(16.4);
        System.out.println("After removing element"+ hs);

        //contains
        System.out.println(hs.contains("welcome"));
        System.out.println(hs.contains("xyz"));

        System.out.println(hs.isEmpty());


        //Read all the element
        //1.for each loop
        /*
        for(Object a : hs){
            System.out.println(a);
        }
         */

        Iterator it = hs.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
