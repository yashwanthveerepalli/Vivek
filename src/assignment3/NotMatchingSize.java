package src.assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NotMatchingSize {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        List<String> strings2 = new ArrayList<>();

        int count =0;

        Scanner scanner = new Scanner(System.in);
        strings.add("qwqe");
        strings.add("qe");
        strings.add("qweqe");
        strings.add("qwe");
        strings.add("qwpqr");
        strings.add("e");

        System.out.println(strings);

        for(String string : strings){
            int y =string.length();
            if(y>count){
                count =y;
                strings2.add(string);
            }

        }
        System.out.println(strings2.get(strings2.size()-1));
    }
}
