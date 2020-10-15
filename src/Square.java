public class Square extends GeometricObject implements  Colorable {
    private double side;

    public Square() {
        this(0);
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

}
