package Lab9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args)  {
        Map mapp = new HashMap<>();
        mapp.put("Артем", 1);
        mapp.put("Борис", 2);
        mapp.put("Вадим", 3);
        mapp.put("Гоша", 4);
        mapp.put("Дима", 5);
        String  name,INN;


        Scanner scan = new Scanner(System.in);

        String [] mas =scan.nextLine().split(" ");
        if (!(mapp.get(mas[0]).toString().equals(mas[1]))){
            try {
                throw new MyExeptions("Неверный INN");
            } catch (MyExeptions e) {
                System.out.println("Введи норм inn");
            }
        }

    }


}
