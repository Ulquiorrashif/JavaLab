package Lab16;

import java.util.ArrayList;
import java.util.Collection;

public class Order {
    Collection<Item > mas;

    public Order(Collection<Item> mas) {
        this.mas = mas;
    }

    public Order() {
        this.mas=new ArrayList<Item>();
    }
    public void add(Item e){
        mas.add(e);
    }
    public void remove (Item e){
        mas.remove(e);
    }
    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        for (Item item : mas) {
            str.append(item.toString()).append("\n");
        }
        return str.toString();
    }

}
