package src.assignment3;


import java.util.Scanner;

public class Composition {

    public static String funcF(String b){

        String c= b;
        System.out.println("Input in F "+c);

        return c;

    }
    public static String funcG(String a){

        String b = a;

        System.out.println("Input in G "+b);

        return funcF(b);


    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input  ");

        String input = scanner.nextLine();

        System.out.println( funcG(input));

    }
}
