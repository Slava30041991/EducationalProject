package lesson5.figures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Figures {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static Scanner sk = new Scanner(System.in);
    static Scanner sk2 = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        General_menu();
    }

    public static void General_menu() throws IOException {
        System.out.println("Введите номер типа фигуры которую хотите создать: ");
        System.out.println("1. Круг\n2. Треугольник\n3. Прямоугольник\n");
        String b = reader.readLine();

        switch (b) {
            case "1":
                Great_Circle();
                Answer();
                break;
            case "2":
                Great_Triangle();
                Answer();
                break;
            case "3":
                Great_Rectangle();
                Answer();
                break;
            default:
                System.out.println("Введите правильное значение");
                General_menu();
        }
    }

    public static void Great_Rectangle() {

        System.out.println("Введите длину прямоугольника: ");
        double length = sk.nextDouble();
        System.out.println("Введите ширину прямоугольника: ");
        double width = sk.nextDouble();
        Rectangle rect = new Rectangle(length, width);
        rect.Info();
    }

    public static void Great_Triangle() {

        Triangle triag = new Triangle();
        System.out.println("Введите параметры треугольника две стороны(в сантиметрах) и угол (в градусах) через пробел(указывайте запятую в дробных числах)");
        System.out.println("Последовательность: 1-е значение = сторона А, 2-е значение = сторона Б и 3-е значение = угол в градусах");
        System.out.println("");
        double[] mass = new double[3];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = sk.nextDouble();
        }
        triag.side_a = mass[0];
        triag.side_b = mass[1];
        triag.ugolok = mass[2];
        triag.Area();
        triag.Perimeter();

    }

    public static void Great_Circle() {
        System.out.println("Введите радиус круга (если число дробное то только через запятую): ");
        double a = sk.nextDouble();
        Circle circ = new Circle(a);
        circ.Info();

    }

    public static void Answer() throws IOException {
        System.out.println("Создать еще одну фигуру? \n1.Да\n2.Нет?");
        int answer = sk2.nextInt();
        switch (answer) {
            case 1:
                General_menu();
                break;
            case 2:
                System.exit(0);
                break;
        }
    }
}
