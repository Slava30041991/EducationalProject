package lesson4;

import java.util.ArrayList;

public class Park {
    public static void main(String[] args) {
        ArrayList<AttractionName> Park = new ArrayList<>();
        Park.add(new Prise("100  рублей"));
        Park.add(new AttractionName("Солнышко"));
        Park.add(new TimeWorks("С 10 до 15"));
        for (AttractionName object: Park) {
            System.out.println(object.toString());
        }
    }
}

class AttractionName {
    String name;

    @Override
    public String toString() {
        return "Название атракциона: "
                 + name + "."
                ;
    }

    public AttractionName(String name) {
        this.name = name;
    }
}

class TimeWorks extends AttractionName {

    public TimeWorks(String time) {
        super(time);
    }

    @Override
    public String toString() {
        return "Время работы атракциона: " + name + ".";
    }
}
class Prise extends AttractionName {

    public Prise(String prise) {
        super(prise);
    }

    @Override
    public String toString() {
        return "Цена атракциона: " + name + ".";
    }
}
