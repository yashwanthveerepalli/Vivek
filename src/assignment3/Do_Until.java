package src.assignment3;

import java.util.Scanner;

public class Do_Until {

    public static boolean function(int x,int y){
       if(increment(x)<=y){
           System.out.println(x);
           return true;

       }
       else {
           return false;
       }
    }
    public static int increment(int x){
      return  x++;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter Predicate input ");
        int predicate = scanner.nextInt();

        for(int i=1;i<= predicate;i++){
            if(function(i,predicate)){
                System.out.print("True ");
            }

        }
    }
}
