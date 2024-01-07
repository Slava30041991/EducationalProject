package lesson5.figures;

public class Rectangle extends Figures {
    double side_a;
    double side_b;

    public Rectangle(double a, double b) {
        side_a = a;
        side_b = b;
    }

    public void Info() {

        double area = side_a * side_b;
        System.out.print("Площадь прямоугольника = ");
        System.out.printf("%.2f", area);
        System.out.println(" сантиметров");

        double perimeter = (side_a + side_b) * 2;
        System.out.print("Периметр равен = ");
        System.out.printf("%.2f", perimeter);
        System.out.println(" сантиметров");
        System.out.println("-------------------------");
    }
}
