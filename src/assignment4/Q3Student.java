package src.assignment4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Q3Student {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        //list.add(4);


        list2.add("ram");
        list2.add("ram");
        list2.add("ram");
        list2.add("ram");
        list2.add("ajay");

        list3.add("krishna");
        list3.add("krishna");
        list3.add("krishna");
        list3.add("krishna");
        list3.add("Pradeep");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                list4.add(String.valueOf(list.get(i)));
            }
        }
        for (int i = list.size(); i < list2.size(); i++) {
            list4.add(list2.get(i).concat(list3.get(i)));
        }


        System.out.println(list4);
    }
}
