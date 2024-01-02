package lesson5.figures;
public class Square extends Figures {

    double side_square;
    public Square(double a){
        side_square = a;
    }

    public void Info(){
        double area = Math.pow(side_square,2);
        System.out.print("Площадь квадрата = ");
        System.out.printf("%.2f", area);
        System.out.println(" сантиметров");
        System.out.println("Периметр = "+side_square*4+" сантиметров");
        System.out.println("-------------------------");
    }
}
