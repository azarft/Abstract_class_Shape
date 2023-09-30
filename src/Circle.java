public class Circle extends Shape{
    private double radius;

    public Circle (String name,double radius)
    {
        super(name);
        this.radius = radius;
    }

    public double getArea()
    {
        double area = Math.PI * radius * radius;
        return area;
    }
    public double getPerimeter()
    {
        double peri = 2 * Math.PI * radius;
        return peri;
    }
}

