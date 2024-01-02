package lesson5.figures;
public class Triangle extends Figures {
    double side_a;
    double side_b;
    double side_c;
    double ugolok;
    public void Area(){
        double area;

        double radian = Math.toRadians(ugolok);

        area = ((side_a*side_b)/2)*Math.sin(radian);
        System.out.print("Площадь треугольника = ");
        System.out.printf("%.2f", area);
        System.out.println(" сантиметра");
    }
    public void Perimeter(){
        double radian = Math.toRadians(ugolok);
        side_c = Math.sqrt((Math.pow(side_a, 2)+Math.pow(side_b, 2))-((side_a*side_b)*Math.cos(radian)));

        double res = side_a+side_b+side_c;
        System.out.print("Периметр треугольника = ");
        System.out.printf("%.2f", res);
        System.out.println(" сантиметра");
        System.out.print("Третья сторона треугольника = ");
        System.out.printf("%.2f", side_c);
        System.out.println("");
        System.out.println("-------------------------");
    }

}
