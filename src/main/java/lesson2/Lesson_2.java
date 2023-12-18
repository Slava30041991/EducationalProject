package lesson2;

public class Lesson_2 {
    public static void main (String [] args) {
        printThreeWords();
        checkSumSign();
        printCol();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Апельсин");
        System.out.println("Банан");
        System.out.println("Яблоко");
    }

    public static void checkSumSign() {
        int a = 4;
        int b = 7;
        int c = a + b;
        if (c >= 0) {
            System.out.println("сумма положительня");
        } else {
            System.out.println("сумма отрицательная");
        }
    }

    public static void printCol() {
        int value = 101;
        if (value <=0) {
            System.out.println("красный");
        } if (value>0 && value<100) {
            System.out.println("желтый");
        } if (value>100) {
            System.out.println("зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 40;
        int b = 40;
        if  (a>=b) {
            System.out.println("a>=b");
        } if (a<b) {
            System.out.println("a<b");
        }
    }

}
