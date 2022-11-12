package Lab16;

public class Start {
    public static void main(String[] args) {
        Order order =new Order();
        Drink d1 = new Drink("tekila","kruto");
        order.add(d1);
        order.add(new Dish(50,"kuritsa","s risom"));
        System.out.println(order.toString());

    }


}
