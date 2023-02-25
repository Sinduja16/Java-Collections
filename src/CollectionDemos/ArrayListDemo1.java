package CollectionDemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        //Declare ArrayList
        ArrayList al = new ArrayList();
        //ArrayList <String> al1 = new ArrayList<String>();
        //ArrayList <Integer> al2 = new ArrayList<Integer>();
        //List al3 = new ArrayList<>();

        //Add new Elements to the ArrayList
        al.add(100);
        al.add("welcome");
        al.add(15.5);
        al.add('A');
        al.add(true);

        System.out.println("Number of elements" + al);

        //size
        System.out.println(al.size());

        //remove
        al.remove(0);
        al.remove("welcome");

        System.out.println("After removing the elements " + al);

        //insert new element
        //add(index, object)
        al.add(2, "python");
        System.out.println("After insert new element " + al);

        //retrieve specific element
        System.out.println(al.get(2));

        //change the element or replace element
        al.set(2, "C#");
        System.out.println("After replacing element " + al);

        //search - contains()
        System.out.println(al.contains("C#"));
        System.out.println(al.contains("C++"));

        //isEmpty
        System.out.println(al.isEmpty());

        //Read values from the arraylist
        // there are approach to read the data from arraylist
        //1. For....loop 2. for...each loop 3. iterator()

       /* //1. for  loop
        for(int i =0; i<= al.size(); i++){

            System.out.println(al.get(i));
        }



        //2. for each loop

        for (Object r : al) {
            System.out.println(r);
        }

        */

        //3. iterator()
        Iterator it = al.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}




