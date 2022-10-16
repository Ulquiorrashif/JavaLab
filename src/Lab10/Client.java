package Lab10;

public class Client {
    public IChar chair;
    public void sit(){
        System.out.println("Sit");
    };

    public void setChair(IChar chair) {
        this.chair = chair;
    }
}
