import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortedMergeList {
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
        int size1 = s.nextInt();
        System.out.println("Enter The size of Array2");
        int size2 = s.nextInt();

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();





        for (int i = 1; i <= size1; i++) {
            System.out.println("Enter First List Value " + i);
            list1.add(s.nextInt());
        }
        for (int i = 1; i <= size2; i++) {
            System.out.println("Enter Second List Value " + i);
            list2.add(s.nextInt());
        }

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(sorted_merge(list1,list2));



    }
}