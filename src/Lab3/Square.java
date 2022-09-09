package Lab3;

public class Square extends Rectangle{
    public Square() {
        length=5;
        width=length;
    }

    public Square(double side) {
        super(side,side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side , color, filled);
    }
    public double getSide(){
        return  length;
    }
    public void setSide(double side){
        width=side;
        length=width;
    }

    @Override
    public void setLength(double length) {
        this.length=length;
        width=this.length;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        this.length=this.width;

    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
