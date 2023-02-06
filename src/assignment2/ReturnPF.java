package src.assignment2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ReturnPF {

    public static void main(String[] args) {

        List<Integer> grades = new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number of Students in the class ");
        int classStrength = scan.nextInt();

        for (int i=1;i<=classStrength;i++){
            System.out.println("Enter Grade of the Student with ID"+i);
            grades.add(scan.nextInt());
        }

        for(int i=0;i<classStrength;i++){
            if(grades.get(i) >=75){
                System.out.println("id "+i+"with grades"+grades.get(i)+" pass");
            }
            else {
                System.out.println("id "+i+"with grades"+grades.get(i)+" fail");
            }

        }

    }


}
