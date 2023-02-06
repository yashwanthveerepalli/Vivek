package src.assignment2;

import java.util.ArrayList;

public class RecProblem1 {


    public static void grading(ArrayList<Integer> marks) {
        for (int i = 0; i < marks.size(); i++) {


            if (marks.get(i) >= 75) {
                System.out.println("pass");

            } else {
                System.out.println("Fail");
            }

        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(100);
        marks.add(10);
        marks.add(20);
        marks.add(75);
        marks.add(80);
        marks.add(90);
        marks.add(33);
        marks.add(78);

        grading(marks);


    }
}



