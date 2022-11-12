package Lab16;

public final class Drink implements Item {
    private final int Price;
    private final String Name;
    private final String Info;

    public Drink(String name, String info) {
        Name = name;
        Info = info;
        Price = 0;
    }

    public Drink(int price, String name, String info) {
        Price = price;
        Name = name;
        Info = info;
    }


    @Override
    public int getPrice() {
        return Price;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public String getInfo() {
        return Info;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "Price=" + Price +
                ", Name='" + Name + '\'' +
                ", Info='" + Info + '\'' +
                '}';
    }
}