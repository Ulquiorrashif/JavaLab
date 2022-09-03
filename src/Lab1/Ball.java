package Lab1;

public class Ball {
    private  String material ;
    private int D;

    public Ball(String material, int d) {
        this.material = material;
        D = d;
    }
    public Ball(){
        material="Резина";
        D=20;

    }

    public int getD() {
        return D;
    }

    public String getMaterial() {
        return material;
    }

    public void setD(int d) {
        D = d;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public void Move(){
        System.out.println("Качусь");
    }
}
