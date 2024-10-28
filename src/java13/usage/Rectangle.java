package java13.usage;

public class Rectangle extends AbShape{

    public Rectangle(int x, int y) {
        super.setX(x);
        super.setY(y);
    }

    @Override
    public double calculateArea() {
        return this.getX() * this.getY();
    }
}


