package Lab8;

public class BoundedWaitList <E> extends WaitList<E>{
    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    public BoundedWaitList(int capacity) {
        super();
        this.capacity = capacity;
    }
    public void add( E element ){
        if (content.size()<capacity)
            super.add(element);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
