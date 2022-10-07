package Lab8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList <E> implements IWaitList <E>{
    protected ConcurrentLinkedQueue <E> content ;

    public WaitList(ConcurrentLinkedQueue<E> content) {
        this.content = content;
    }

    public WaitList() {
        this.content= new ConcurrentLinkedQueue<E>();
    }

    @Override
    public String toString() {
        return content.toString();
    }

    @Override
    public void add(E element) {
        content.add(element);
    }

    @Override
    public E remove() {
         return content.poll();
    }

    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }
}
