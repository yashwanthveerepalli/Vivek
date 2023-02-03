package src.assignment1;

import java.util.*;


public class CumulativeSum {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The size of Array");
        int size = s.nextInt();
        List<Integer> list1 = new ArrayList<>();

        for(int i=1;i<=size;i++)
        {
            System.out.println("Enter Value "+i);
            list1.add(s.nextInt());
        }
        List<Integer> list2 = new ArrayList<>();
        list2.add(list1.get(0));
        for (int i = 1; i < list1.size(); i++) {
            list2.add(list2.get(i - 1) + list1.get(i));
        }
        System.out.println(list2);

    }
}
