package src.assignment3;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        System.out.println("Enter String");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char ch;
        String str2 = "";


        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            str2 = ch + str2;
        }
        System.out.println("Reversed String: " + str2);
    }
}


