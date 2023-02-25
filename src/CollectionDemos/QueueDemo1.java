package CollectionDemos;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo1 {
    public static void main(String []args){

        PriorityQueue q = new PriorityQueue();
        /*
        //Adding values
        q.add("A");
        q.add("B");
        q.add("C");
        q.add("C");
        q.offer("D");

        System.out.println(q);

         */

        //get head element
        //System.out.println(q.element());
        //System.out.println(q.peek());

        //Return and remove element
        //System.out.println(q.remove());
        //System.out.println(q);

        System.out.println(q.poll());
        System.out.println(q);

        //Print the elements
        Iterator itr = q.iterator();
        while(itr.hasNext()){
            System.out.println(q);
        }

        //for each
        for(Object ele: q){
            System.out.println(ele);
        }







    }
}
