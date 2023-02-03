package src.assignment1;

import java.util.HashMap;
import java.util.*;

public class MapString {

    public static void main(String[] args) {


        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

        Scanner scan = new Scanner(System.in);
        int count = 0;

        System.out.println("Enter Size");
        int size = scan.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.println("Enter Integer and String");
            hashmap.put(scan.nextInt(), scan.next());
        }

        System.out.println("Enter search string");
        String string = scan.next();

        for (Object key = hashmap.keySet()) {
            Object value = hashmap.get(key);
            if (value == string) {
                Object name = key.toString();
                System.out.println("SOME " + name);
                count = 1;

            }


        }

        if (count == 0) {
            System.out.println("NONE");

        }


    }


}
