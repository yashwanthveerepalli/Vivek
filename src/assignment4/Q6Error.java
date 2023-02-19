package src.assignment4;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

public class Q6Error {
    public static int getNumber(int n){
       if(n<=0){
           throw new ArithmeticException("Improper input");
       }
       else {
           return n;
       }
    }

    public static void main(String[] args) {
            System.out.println(getNumber(0));
    }
}
