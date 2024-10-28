package java13.usage;

public class Circle extends AbShape{

    public Circle(int x) {
        super.setX(x);
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.getX() * this.getX();
    }
}
