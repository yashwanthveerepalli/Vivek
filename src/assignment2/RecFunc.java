package src.assignment2;

import java.util.ArrayList;

public class RecFunc {

    public static void matchLogic(String input, ArrayList<String> strings,int i){
        if(input == strings.get(i)){
           strings.remove(i);
            System.out.println("Some "+strings);
        }
        else {
            if(i == strings.size())
            {
                System.out.println("None");
            }
            else {
                matchLogic(input, strings,i++);
            }

        }
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("sample");
        list.add("sample1");


        matchLogic("sample",list,0);
    }
}
