package Lab11;

public class Main {
    public static void main(String[] args) {
        LinkedQueue mas= new LinkedQueue();
        mas.enqueue(1);
        mas.enqueue(2);
        mas.enqueue(3);
        mas.enqueue(4);
        mas.print();
        mas.dequeue();
        mas.print();
    }
}