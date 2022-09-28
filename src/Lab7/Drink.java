package Lab7;

import java.io.InputStream;
import java.util.*;

public class Drink {
     LinkedList dek1 =  new LinkedList();
     LinkedList dek2 = new LinkedList();

    public Drink() {
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<5;i++)
            dek1.add(scanner.nextInt());
        for (int i=0; i<5;i++)
            dek2.add(scanner.nextInt());
        System.out.println(dek1);
        System.out.println(dek2);
    }

    public static void main(String[] args) {
        Drink drink= new Drink();
    }
}
