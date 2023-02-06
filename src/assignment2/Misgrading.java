package src.assignment2;

import java.util.*;

public class Misgrading {

    public static void main(String[] args) {


        HashMap<String,HashMap<Integer,Integer>> input = new HashMap<>();

        HashMap<Integer, Integer> val = new HashMap<Integer, Integer>();


        System.out.println("Enter Number of students in the class");
        Scanner scanner = new Scanner(System.in);
        int classStrength = scanner.nextInt();

        for(int i=1;i<=classStrength;i++){
            System.out.println("Enter Grades of the Student With ID"+i);

            val.put(i,scanner.nextInt());

            System.out.println("Enter The grade for the student with grade"+val.get(i));

            input.put(scanner.next(),val);

        }

        System.out.println(input);

        for(String grade : input.keySet()){
            if(grade == "pass"){
                HashMap<Integer, Integer> value = input.get(grade);
                for(int result : value.keySet()){

                }

            }
        }


    }
}
