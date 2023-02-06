package src.assignment2;

import java.util.ArrayList;
import java.util.HashMap;

public class FnLnMn {


        public static void main(String[] args) {


            ArrayList<String> list1 = new ArrayList<>();
            ArrayList<String> list2 = new ArrayList<>();
            ArrayList<String> list3 = new ArrayList<>();
            HashMap<String,String>  fn = new HashMap<>();
            HashMap<String,String>  ln = new HashMap<>();
            HashMap<String,String>  mn = new HashMap<>();




            list1.add("test1");
            list1.add("test2");
            list1.add("test3");
            list2.add("test4");
            list2.add("test5");
            list2.add("test6");
            list3.add("test7");
            list3.add("test8");
            list3.add("test9");
            fn.put("fn","test1");
            ln.put("ln","test22");
            mn.put("mn","test33");

Object value = fn.get("fn");
            for (int i=0;i<3;i++){
                if(value == list1.get(i)){
                    for (int j=0;j<3;j++) {
                        fn.put("fn", list1.get(j));

                        System.out.print(fn+",");
                        System.out.print(ln+",");
                        System.out.println(mn);
                    }
                }
                if(value == list2.get(i)){
                    for (int j=0;j<3;j++) {

                        fn.put("fn", list2.get(j));
                        System.out.print(fn);
                        System.out.print(ln);
                        System.out.println(mn);
                    }


                }
                if(value == list3.get(i)){
                    for (int j=0;j<3;j++) {

                        fn.put("fn", list3.get(j));
                        System.out.print(fn);
                        System.out.print(ln);
                        System.out.println(mn);
                    }


                }
            }



        }
    }


