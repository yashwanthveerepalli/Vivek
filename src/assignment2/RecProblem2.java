package src.assignment2;

import java.util.ArrayList;
import java.util.HashMap;

public class RecProblem2 {
    public static void misgrading(HashMap<String,Integer> grades){

        int count =0;

        for(Object key : grades.keySet()){
            if(key == "pass" && 75 <=grades.get(key)){
                count = count;
            }
            else if(key == "fail" && 75 > grades.get(key)){
                count = count ;
            }
            else {
                count++;
            }

        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        HashMap<String,Integer> grades = new HashMap<>();


        grades.put("fail",90);
        grades.put("pass",22);

        misgrading(grades);


    }
}
