package entities;

public class Rectangle {
    public double Width;
    public double Height;

    public double Area() {
        double Area;
        return Area = (Height * Width);

    }

    public double perimeter() {
        double perimeter;
        return (2 * (Width + Height));
    }

    public double diagonal() {
        return Math.sqrt(Width * Width + Height * Height);
    }
}


