package lesson5;

import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        int action;
        Scanner sc = new Scanner(System.in);

        Animal[] animals = new Animal[4];
        animals[0] = new Cat("Кот сиамский", "Мурзик", 0, 200, 5, false);
        animals[1] = new Cat("Кошка абиссинская", "Алиса", 6, 250, 4, false);
        animals[2] = new Dog("Собака Дог (кобель)", "Наг", 60, 1000);
        animals[3] = new Dog("Собака Пудель (самка) ", "Лора", 25, 500);

        System.out.println("Характеристики созданных животных");
        System.out.println(" ");
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
        System.out.println(" ");

        System.out.println("Всего котов создано: " + (Cat.getCount()));
        System.out.println("Всего собак создано: " + Dog.getCount());
        System.out.println("Всего животных создано: " + Animal.getCount());
        System.out.println();
        System.out.println("Тестирование подопытных на выносливость: ");
        System.out.println("Бег: ");
        System.out.println(" ");

        for (int i = 0; i < animals.length; i++) {
            animals[i].run(500);
        }
        System.out.println(" ");
        System.out.println();
        System.out.println("Плавание: ");
        System.out.println(" ");

        for (int i = 0; i < animals.length; i++) {
            animals[i].swim(50);
        }

        Plate plate = new Plate(50);
        plate.info();
        for (Animal animal : animals) {
            if (!animal.fullness && animal.appetite < plate.food) {
                animal.eat(plate);
                animal.fullness = true;
                System.out.println("Котик " + animal.name + " покушал!");
            } else {
                System.out.println("Котик " + animal.name + " не поел!");
            }
        }
        plate.info();
        System.out.println("Сколько грамм вискаса добавить еще в миску?");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();

    }
}

