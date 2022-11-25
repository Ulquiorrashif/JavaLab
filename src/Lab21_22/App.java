package Lab21_22;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println( "Какой документ нужен");
        Scanner scanner=new Scanner(System.in);
        new Frame(new AFab().create(scanner.nextLine()));
    }
}
