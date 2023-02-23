package src.assignment5;

import java.util.Scanner;

//Question 2
public class Double {
        public static double toDouble(Integer i) {
            return i * 2.0;
        }

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int i =scanner.nextInt();

       // Integer i = 2;
        double d = Double.toDouble(i);
        System.out.println(d);

    }
}

