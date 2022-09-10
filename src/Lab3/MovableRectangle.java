package Lab3;

public class MovableRectangle implements Movable{
    MovablePoint topLeft;
    MovablePoint bottomRight;
    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed,  int ySpeed) {
        topLeft.x=x1;
        topLeft.y=y1;
        bottomRight.x=x2;
        bottomRight.y=y2;
        topLeft.xSpeed=xSpeed;
        topLeft.ySpeed=ySpeed;
        bottomRight.xSpeed=xSpeed;
        bottomRight.ySpeed=ySpeed;

    }
    public String toString() {
        return "MovableCircle{" +
                "x1=" + topLeft.x +
                ", y1=" + topLeft.y +
                ", x2=" + bottomRight.x +
                ", y2=" + bottomRight.y +
                ", xSpeed=" + topLeft.xSpeed +
                ", ySpeed=" + bottomRight.ySpeed +
                '}';
    }
     public boolean chek(){
        if (topLeft.ySpeed==bottomRight.xSpeed)
            return true;
        else
            return  false;
     }
}
