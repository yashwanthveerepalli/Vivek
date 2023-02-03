package src.assignment1;

import java.util.*;

public class ListRepeat {



        public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter The size of Array");
            int size = s.nextInt();
            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();

            for(int i=1;i<=size;i++)
            {
                System.out.println("Enter First List Value "+i);
                list1.add(s.nextInt());
            }
            for(int i=1;i<=size;i++)
            {
                System.out.println("Enter Second List Value "+i);
                list2.add(s.nextInt());
            }

            List<Integer> list3 = new ArrayList<>();
            for(int i=0;i<list1.size();i++)
            {
                for(int j=0;j<list2.get(i);j++)
                {
                    list3.add(list1.get(i));
                }
            }


            System.out.println(list3);

        }
    }


