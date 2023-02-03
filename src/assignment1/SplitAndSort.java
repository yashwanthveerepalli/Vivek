package src.assignment1;

import java.util.*;


public class SplitAndSort {
    public static List<Integer> sorted_merge(
            List<Integer> list1, List<Integer> list2) {

        List<Integer> listall = new ArrayList<>();
        int i = 0,j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                listall.add(list1.get(i));
                i++;
            } else {
                listall.add(list2.get(j));
                j++;
            }
        }
        while (i< list1.size() && j >= list2.size()) {

            listall.add(list1.get(i));
            i++;
        }
        while (i>= list1.size() && j < list2.size()) {

            listall.add(list2.get(j));
            j++;
        }

        return listall;
    }

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
        System.out.println(" Threshold from the List "+list1.get(0));
        int threshold = list1.get(0);

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
        Collections.sort(list2);
        Collections.sort(list3);
        System.out.println("Sorted List 1 "+list2+" Sorted List 2 "+list3+" After Merging and Sorting "+sorted_merge(list2,list3));

    }
}
