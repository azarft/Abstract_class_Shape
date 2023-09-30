public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String name, double width, double height)
    {
        super(name);
        this.height = height;
        this.width = width;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getArea()
    {
        double v = width * height;
        return v; 
    }
    public double getPerimeter()
    {
        double peri = width * 2 + height * 2;
        return peri;
    }

}
