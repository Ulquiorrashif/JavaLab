package Lab5;

import java.util.Scanner;

public class Recursion {

    int b=0;

    public int  turn (int a){ //10 вариант


        if (a%10==0){
        }
        else{
            b=b*10+a%10;
            turn(a/10);

        };
        return b;
    };

    public static void main(String[] args) {
        Recursion rec =new Recursion();
        System.out.println(rec.counter());
    }
    public int counter(){
        int a=0;
        Scanner in = new Scanner(System.in);
        String num = in.next();
        if (!num.equals("00")){
            if (Integer.parseInt(num)==1)
                a+=1;
            return a+counter();

        }else
            return 0;

    }
}