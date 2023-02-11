package src.assignment3;

import src.assignment1.ListPairs;

import java.util.ArrayList;
import java.util.List;

public class DoubleFunc {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        List<Integer> integers2 = new ArrayList<>();

        integers.add(2);
        integers.add(3);

        for(int integer : integers){
            integer= integer*2;
            integers2.add(integer);
        }
        System.out.println(integers);

        System.out.println(integers2);
    }
}
