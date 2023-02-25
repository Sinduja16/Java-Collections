package CollectionDemos;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String []args){

        LinkedList l = new LinkedList();
        l.add("Z");
        l.add("Y");
        l.add("X");
        l.add("C");
        l.add("A");
        l.add("B");

        LinkedList new_l = new LinkedList();
        new_l.addAll(l);
        System.out.println(new_l);

        new_l.removeAll(l);
        System.out.println(new_l);

        //sort()
        System.out.println("Before sorting "+ l);
        Collections.sort(l);
        System.out.println("After sorting "+ l);

        //reverse
        Collections.sort(l,Collections.reverseOrder());
        System.out.println("reverse sorting "+ l);

        //Shuffling
        Collections.shuffle(l);
        System.out.println("After Shuffling "+ l);


    }
}
