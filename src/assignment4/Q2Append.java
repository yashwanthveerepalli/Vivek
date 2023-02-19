package src.assignment4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2Append {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        int size = 3;

        for(int i=0;i< 3;i++){
           String s= scanner.nextLine();
           list.add(s);
        }

        String s2=scanner.nextLine();

        for(int i=0;i<3;i++){
            list2.add(list.get(i).concat(s2));
        }

        System.out.println(list2);
    }
}
