package src.assignment3;

import java.util.Scanner;

public class Do_until_factorial {

    public static int factorial(int x){
        if(x>=1){

        return x*factorial(x-1);

        }
        else{
            return 1;
        }
    }

    public static boolean check(int x ,int pred){
        if(x<pred){
            System.out.println("Factorial of "+x+" is "+factorial(x));

            return true;

        }
        else {
            return false;
        }


    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter Predicate input ");
        int predicate = scanner.nextInt();

        for(int i=1;i<=predicate;i++){
            if(check(i,predicate)){
                System.out.println("");
            }
        }


    }
}
