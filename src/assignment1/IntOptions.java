package src.assignment1;

import java.util.*;

public class IntOptions {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();
        int sum =0,i=0,count=0;
        String value ="";

        Scanner s = new Scanner(System.in);
        stringList.add("SOME 1");
        stringList.add("NONE");
        stringList.add("SOME 3");

        System.out.println("Given Input "+stringList);


        for(String string: stringList){
            String expression = string.substring(0,4).toLowerCase(Locale.ROOT);
            if(!expression.equals("none")) {
                count = Integer.parseInt(string.substring(5));
            }
            switch(expression){
                //Case statements
                case "some":
                    sum = count+sum;
                    break;
                case "none":
                    break;
                //Default case statement
                default:System.out.println("Invalid Input");
            }

        }
        if(sum > 0){
            System.out.println("SOME "+sum);
        }
        else{
            System.out.println("NONE");
        }

    }
}

