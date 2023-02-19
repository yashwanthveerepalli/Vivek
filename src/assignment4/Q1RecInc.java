package src.assignment4;

import java.util.Scanner;

public class Q1RecInc {

    public static int recursiveIncrement(int begin, int end, int inc){

    if(begin<end) {
        System.out.println(begin);
        recursiveIncrement(begin + inc, end, inc);
    }

        return begin;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 values");
        int begin = scanner.nextInt();
        int end = scanner.nextInt();
        int inc = scanner.nextInt();
        recursiveIncrement(begin,end,inc);
    }
}
