package CollectionDemos;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String []args){
        //declare linked list
        LinkedList l = new LinkedList();

        //Add elements into linked list
        l.add(100);
        l.add("welcome");
        l.add(15.5);
        l.add('A');
        l.add(true);
        l.add(null);

        System.out.println(l);

        System.out.println(l.size());

        //remove
        //l.remove(3);
        l.remove("welcome");

        System.out.println("After removing " + l);

        //insert value in the middle
        l.add(3, "Java");
        System.out.println("After inserting " + l);

        //retriving value/ object
        System.out.println(l.get(3 ));

        //replace the value
        l.set(5, "X");
        System.out.println("After replacing " + l);

        //contains
        System.out.println(l.contains("Java"));
        System.out.println(l.contains("python"));

        //isEmpty
        System.out.println(l.isEmpty());
        /*
        //Reading the elements
        //1. for loop

        for(int i = 0; i<l.size(); i++){
            System.out.println(l.get(i));
        }

        //2. Enhanced for loop
        for(Object e: l){
            System.out.println(l);
        }

         */

        //3.iterator()

        Iterator it = l.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }



    }
}
