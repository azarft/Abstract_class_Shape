import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose your shape type: ");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Triangle");
            System.out.println("4. Square");
            System.out.println("5. Exit");
            int shapeType = scanner.nextInt();
            switch (shapeType) {
                case 1:
                    System.out.println("Write the width of Rectangle: ");
                    double width = scanner.nextDouble();
                    System.out.println("Write the height of Rectangle: ");
                    double height = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle("Rectangle", width, height);
                    System.out.println("Area: " + rectangle.getArea());
                    System.out.println("Perimeter: " + rectangle.getPerimeter());
                    break;
                case 2:
                    System.out.println("Write the radius of Circle: ");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle("Circle", radius);
                    System.out.println("Area: " + circle.getArea());
                    System.out.println("Perimeter: " + circle.getPerimeter());
                    break;
                case 3:
                    System.out.println("Write the side1 of Triangle: ");
                    double side1 = scanner.nextDouble();
                    System.out.println("Write the side2 of Triangle: ");
                    double side2 = scanner.nextDouble();
                    System.out.println("Write the side3 of Triangle: ");
                    double side3 = scanner.nextDouble();
                    Triangle triangle = new Triangle("Triangle", side1, side2, side3);
                    System.out.println("Area: " + triangle.getArea());
                    System.out.println("Perimeter: " + triangle.getPerimeter());
                    break;
                case 4:
                    System.out.println("Write the side of Square: ");
                    double side = scanner.nextDouble();
                    Square square = new Square("Square", side);
                    System.out.println("Area: " + square.getArea());
                    System.out.println("Perimeter: " + square.getPerimeter());
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    scanner.close(); // Close the scanner
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid shape type.");
                    break;
            }
        }
    }
}