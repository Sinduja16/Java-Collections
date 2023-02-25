package CollectionDemos;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {
    public static void main(String[] args) {

        String arr[] = {"Dog", "Elephant", "Cat"};

        for( String value : arr){
            System.out.println(value);
        }

        //convert array in to array list
        ArrayList al = new ArrayList(Arrays.asList(arr));
        System.out.println(al);

    }
}
