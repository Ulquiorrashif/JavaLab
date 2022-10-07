package Lab8;

public class Main {
    public static void main(String[] args) {
        BoundedWaitList mas = new BoundedWaitList ( 5 );
        mas.add(1);
        mas.add(2);
        mas.add(3);
        mas.add(4);
        mas.add(5);
        UnfairWaitList mas2 = new UnfairWaitList();
        mas2.add(1);
        mas2.add(2);
        mas2.add(3);
        mas2.add(4);
        mas2.add(5);
        System.out.println(mas.getCapacity());
        mas.add(6);
        mas.remove();
        mas2.remove(3);
        mas2.moveToBack(2);
        System.out.println(mas.getCapacity());
        System.out.println(mas.toString());
        System.out.println(mas2.toString());


    }
}
