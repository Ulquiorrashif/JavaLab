package Lab12_15;

public class Start {
    public static void main(String[] args) {
        Person me = new Person("", "Trigubov", "");

        System.out.println(me.getForname());

        Adress adres=new Adress("Russian. Msk, Moskau; Lubanka- 34, d6; 77");
        System.out.println(adres.toString());
        adres.only("Russian, Msk, Moskau, Lubanka, 34, d6, 77");
        System.out.println(adres.toString());
    }
}
