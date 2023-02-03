package src.assignment1;

import javafx.util.Pair;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListPairs {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The size of Array");
        int size1 = s.nextInt();
        System.out.println("Enter The size of Array2");
        int size2 = s.nextInt();

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();


        for (int i = 1; i <= size1; i++) {
            System.out.println("Enter First List Value " + i);
            list1.add(s.nextInt());
        }
        for (int i = 1; i <= size2; i++) {
            System.out.println("Enter Second List Value " + i);
            list2.add(s.nextInt());
        }



        List<Pair<Integer,Integer>> listPair = new ArrayList<Pair<Integer,Integer>>();
        for(int i=0;i<list1.size() ;i++)
        {
            if(list2.get(i)!=null){
                listPair.add(new Pair<Integer, Integer>(list1.get(i), list2.get(i))); //elements of list should be saved to value in Pair<Integer, Integer>
            }
            else {
                break;
            }
        }

        System.out.println(listPair);

    }
}
