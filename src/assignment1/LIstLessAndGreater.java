package src.assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LIstLessAndGreater {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The size of Array");
        int size = s.nextInt();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<ArrayList<Integer>> listall= new ArrayList<ArrayList<Integer>>();


        for (int i = 1; i <= size; i++) {
            System.out.println("Enter Value " + i);
            list1.add(s.nextInt());
        }
        System.out.println("Enter Threshold from the List "+list1);
        int threshold = s.nextInt();

        for(int i=0;i<size;i++){
            if(list1.get(i)<threshold && list1.get(i)!=threshold){
                list2.add(list1.get(i));
            }
            else {
                list3.add(list1.get(i));
            }
        }
        listall.add((ArrayList<Integer>) list2);
        listall.add((ArrayList<Integer>) list3);
        System.out.println(listall);
    }
}
