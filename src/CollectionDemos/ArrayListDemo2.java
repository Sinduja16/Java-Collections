package CollectionDemos;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        ArrayList ald = new ArrayList();
        ald.add("Z");
        ald.add("B");
        ald.add("C");
        ald.add("X");
        ald.add("D");
        ald.add("A");

        ArrayList ald_dup = new ArrayList();
        ald_dup.addAll(ald);
        System.out.println(ald_dup);

        ald_dup.removeAll(ald);
        System.out.println("After removing " + ald_dup);

        //Sort --> Collections.sort();
        Collections.sort(ald);
        System.out.println("After sorting" + ald);

        //sort in reverse order
        Collections.sort(ald, Collections.reverseOrder());
        System.out.println("Reverse order" + ald);

        //Shuffling
        Collections.shuffle(ald);
        System.out.println("Shuffling "+ ald);













    }
}
