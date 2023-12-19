package lesson3;
public class Lesson_3 {


        public static void main(String[] args) {
            isInsideTask1(11,15);
            sendMyIsPositiveOrNegativeNumberTask2(-2);
            isNegativeTask3(-2);
            messageTask4("строка",5);
            isLeapYearTask5(2024);
            IntegerArrayTask6();
            changeArrayTask7();
            numberLessThanSixTask8();
            task9();
            task10(5,10);

        }
        public static boolean isInsideTask1(int a, int b) {
        return (a + b) > 9 && (a + b) < 21;
        }

        public static void sendMyIsPositiveOrNegativeNumberTask2(int a) {

        if(a < 0){
            System.out.println("Число: "+ a +" - отрицательное.");
        } else {
            System.out.println("Число: "+ a +" - положительное.");
        }
        }

        public static boolean isNegativeTask3(int a) {

        return a < 0;
        }

        public static void messageTask4(String message, int b) {
        for (int k = 0; k < b; k++) {
            System.out.println(message);
        }
    }

         public static void isLeapYearTask5(int year) {

        if ((year % 4) != 0 || ((year % 100) == 0 && (year % 400) != 0)) {
            System.out.println("Год, " + year + " НЕ является високосным.");
        } else {
            System.out.println("Год, " + year + " является Високосным!");
        }
        }

    public static void IntegerArrayTask6() {

        int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int maxMass = mass.length;
        for(int i = 0; i < maxMass; i++){
            System.out.print (i + "-" + mass[i]+" ");
        }
        System.out.println("");
        for(int i = 0; i < maxMass; i++)
            if(mass[i] == 1) {
                mass[i] = 0;
            }else mass[i] = 1;
        for(int i = 0; i < maxMass; i++){
            System.out.print (i + "-" + mass[i]+" ");
        }
    }

    public static void changeArrayTask7(){
        int[] array = new int[100];
        int value = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
            value += 1;
            System.out.println(array[i]);
        }
    }

    public static void numberLessThanSixTask8(){
        int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int maxMas = mas.length;
        for(int i = 0; i < maxMas; i++) {
            if (mas[i] < 6) mas[i] = mas[i] * 2;
        }
        for(int i = 0; i < maxMas; i++)
        {
            System.out.print (i + "-" + mas[i]+" ");
        }
    }

    public static void task9() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][i] = 1;
                arr[i][5 - i - 1] = 1;
                System.out.print(arr[i][j] + "]" + "");
            }
            System.out.println();
        }}

        public  static  void  task10 ( int len , int initialValue ) {
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr [i] = initialValue;
                System.out.println("[" + i + "]" + arr [i] + "");
            }
        }
    }










