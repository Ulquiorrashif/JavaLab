package Lab16;

public final class Dish implements Item {

    private final int Price;
    private final String Name;
    private final String Info;

    public Dish(int Price, String Name, String Info) {
        this.Price = Price;
        this.Name = Name;
        this.Info = Info;
    }

    public Dish(String Name, String Info) {
        this.Name = Name;
        this.Info = Info;
        Price = 0;
    }

    public int getPrice() {
        return Price;
    }

    public String getName() {
        return Name;
    }

    public String getInfo() {
        return Info;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "Price=" + Price +
                ", Name='" + Name + '\'' +
                ", Info='" + Info + '\'' +
                '}';
    }
}

