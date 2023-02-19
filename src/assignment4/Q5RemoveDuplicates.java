package src.assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Q5RemoveDuplicates {
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size");
        int size = scanner.nextInt();
        for(int i=0;i<size;i++){
            System.out.println("Enter String");
            list.add(scanner.nextLine());
        }
        System.out.println("List with duplicates: "
                + list);

        List<String> newList = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("List with duplicates removed: "
                + newList);
    }
}
