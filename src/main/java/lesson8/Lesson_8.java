package lesson8;

import java.util.HashMap;

public class Lesson_8 {
    private static String analyzedData = "Мороз и солнце; день чудесный!\n" +
            "Еще ты дремлешь, друг прелестный -\n" +
            "Пора, красавица, проснись:\n" +
            "Открой сомкнуты негой взоры\n" +
            "Навстречу северной Авроры,\n" +
            "Звездою севера явись!" +
            " Вечор, ты помнишь, вьюга злилась,\n" +
            "На мутном небе мгла носилась;\n" +
            "Луна, как бледное пятно,\n" +
            "Сквозь тучи мрачные желтела,\n" +
            "И ты печальная сидела -\n" +
            "А нынче... погляди в окно:\n " +
            " Под голубыми небесами\n" +
            "Великолепными коврами,\n" +
            "Блестя на солнце, снег лежит;\n" +
            "Прозрачный лес один чернеет,\n" +
            "И ель сквозь иней зеленеет,\n" +
            "И речка подо льдом блестит." +
            " Вся комната янтарным блеском\n" +
            "Озарена. Веселым треском\n" +
            "Трещит затопленная печь.\n" +
            "Приятно думать у лежанки.\n" +
            "Но знаешь: не велеть ли в санки\n" +
            "Кобылку бурую запречь?\n" +
            " Скользя по утреннему снегу,\n" +
            "Друг милый, предадимся бегу\n" +
            "Нетерпеливого коня\n" +
            "И навестим поля пустые,\n" +
            "Леса, недавно столь густые,\n" +
            "И берег, милый для меня." +
            " Спасибо за внимание.";
    private static final String format = "|%1$-40.38s|%2$-30.28s|\n";
    private static final HashMap<String, Integer> hashMap = new HashMap<>();

    public static void main(String[] args) {

        analyzedData = analyzedData.replaceAll("[^A-Za-zА-ЯЁа-яё0-9 ]", " ").toLowerCase();
        analyzedData = analyzedData.replaceAll("[\\s]{2,}", " ");
        String[] regularArray = analyzedData.split(" ");
        System.out.println("Задача №1");
        System.out.println(" Текста имеет " + regularArray.length + " слов.");

        for (String s : regularArray) {
            hashMap.putIfAbsent(s, 0);
            hashMap.put(s, hashMap.get(s) + 1);
        }

        System.out.println("Таблица результатов ");
        System.out.println("_________________________________________________________________________");
        System.out.format(format, "         слово / фраза", " Количество повторений");
        System.out.println("=========================================================================");
        hashMap.entrySet().stream().sorted(HashMap.Entry.<String, Integer>comparingByValue().reversed()).forEach(stringIntegerEntry -> {
            String k = stringIntegerEntry.getKey();
            Integer v = stringIntegerEntry.getValue();
            System.out.format(format, " " + k + " ", "   " + +v + " раз.");
        });
        System.out.println("-------------------------------------------------------------------------");

        PhoneBook pB = new PhoneBook();

        System.out.println("Задача №2 телефонный справочник");
        pB.add("Кеша", "25-22-1");
        pB.add("Миша", "26-22-1");
        pB.add("Дима", "27-22-1");
        pB.add("Паша", "28-22-1");
        pB.add("Андрей", "29-22-1");
        pB.add("Дима", "30-22-1");
        pB.add("Иван", "31-22-1");
        pB.add("Кеша", "32-22-1");

        pB.get("Дима");
        pB.get("Иван");
        pB.get("Паша");
    }
}
