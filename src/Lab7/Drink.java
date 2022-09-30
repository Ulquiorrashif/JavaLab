package Lab7;

import java.io.InputStream;
import java.util.*;

public class Drink {
     LinkedList <Integer>dek1 =  new LinkedList();
     LinkedList<Integer> dek2 = new LinkedList();

    public Drink() {
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<5;i++)
            dek1.add(scanner.nextInt());
        for (int i=0; i<5;i++)
            dek2.add(scanner.nextInt());
    }
    void move(){
        if ((dek1.peek() > dek2.peek() | (dek1.peek() == 0 & dek2.peek() == 9)) &
                !(dek1.peek() == 9 & dek2.peek() == 0)){
            dek1.add(dek1.getFirst());
            dek1.add(dek2.getFirst());
            dek1.pop();
            dek2.pop();
        }else{
            dek2.add(dek2.getFirst());
            dek2.add(dek1.getFirst());
            dek1.pop();
            dek2.pop();}

    }
    String gameStart(){
        int i=0;
        while(i!=106){
            if (dek1.size()==0)
                return "second " + i;
            else if (dek2.size()==0) {
                return "first " + i;
            }
            else{
                move();
                i++;}
        }
        return "botva";
    }

    public static void main(String[] args) {
        Drink drink= new Drink();
        System.out.println(drink.gameStart());

    }
}
/*
2 4 6 8 0
1 3 5 7 9


1 3 5 7 9
2 4 6 8 0

5 1 2 3 4
0 6 7 8 9

*/
