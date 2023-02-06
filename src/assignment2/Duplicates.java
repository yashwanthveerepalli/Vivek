package src.assignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class Duplicates {

    public static void main(String[] args) {


        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();

        list1.add("test1");
        list1.add("test2");
        list1.add("test3");
        list2.add("test4");
        list2.add("test5");
        list2.add("test6");
        list3.add("test7");
        list3.add("test8");
        list3.add("test9");

        String test1 = "test1";

        for (int i=0;i<3;i++){
            if(test1 == list1.get(i)){
                list1.remove(i);
                System.out.println(list1);
                break;
            }
            if(test1 == list2.get(i)){
                list2.remove(i);
                System.out.println(list2);
                break;

            }
            if(test1 == list3.get(i)){
                list1.remove(i);
                System.out.println(list3);
                break;

            }
        }



    }
}
