import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle height and width: ");
        rectangle.Height = sc.nextDouble();
        rectangle.Width = sc.nextDouble();

        System.out.println();

        double Area = rectangle.Area();
        System.out.printf("Area = %.2f%n", Area);


        double perimeter = rectangle.perimeter();
        System.out.printf("PERIMETER = %.2f%n ", perimeter);

        double diagonal = rectangle.diagonal();
        System.out.printf("DIAGONAL = %.2f%n", diagonal);


    }
}