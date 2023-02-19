package src.assignment4;

import java.util.Scanner;

public class Q4Fibbonacci {
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(fib(n));
    }
}
