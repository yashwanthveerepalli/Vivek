package src.assignment5;

import java.util.function.IntBinaryOperator;

//Question 3
public class GeneralizedFibbonacci {
    public static int generalizedFibonacci(int n, IntBinaryOperator op) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return op.applyAsInt(generalizedFibonacci(n - 1, op), generalizedFibonacci(n - 2, op));
        }
    }

    public static void main(String[] args) {
        IntBinaryOperator sum = (a, b) -> a - b;
        for (int i = 0; i < 10; i++) {
            System.out.println(generalizedFibonacci(i, sum));
        }

    }

}
