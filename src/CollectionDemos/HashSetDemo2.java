package CollectionDemos;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String []args){

        HashSet <Integer> evenNUmber = new HashSet<>();
        evenNUmber.add(2);
        evenNUmber.add(4);
        evenNUmber.add(6);
        evenNUmber.add(10);

        System.out.println("Hashset" + evenNUmber);

        //addAll()
        HashSet <Integer> numbers = new HashSet<Integer>();

        numbers.addAll(evenNUmber);
        numbers.add(8);

        System.out.println("Hashset" + numbers);

        //removeAll()
        numbers.removeAll(evenNUmber);
        System.out.println(numbers);


    }

    }
