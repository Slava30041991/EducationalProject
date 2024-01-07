package lesson5.figures;

public class Circle extends Figures {
    double radius;

    public Circle(double r) {
        radius = r;
    }

    public void Info() {
        if (radius < 0) {
            System.out.println("не правильно указан размер радиуса");
        } else {
            double s = Math.pow(radius, 2) * Math.PI;
            System.out.print("Площадь круга = ");
            System.out.printf("%.2f", s);
            System.out.println(" сантиметра");
            double okr = 2 * Math.PI * radius;
            System.out.print("Окружность = ");
            System.out.printf("%.2f", okr);
            System.out.println(" сантиметра");
            System.out.println("-------------------------");
        }
    }
}
