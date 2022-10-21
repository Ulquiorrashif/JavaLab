package Lab11;

import java.util.Collection;
import java.util.Objects;
import java.util.Queue;

public interface IQueue<E> {
     void enqueue(E e);
     E element();
     E dequeue();
     int size();
     void clear();
}
