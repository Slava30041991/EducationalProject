package lesson5;
public class Animal implements Cloneable {
    public int appetite;
    public boolean fullness;
    protected String type;
    public String name;
    protected int swims;
    protected int run;
    private static int count;

    public Animal() {
        count++;
    }
    public static int getCount() {
        return count;
    }
    @Override
    public String toString() {
        return "Вид/порода: '" + type + '\'' +
                ", Кличка: '" + name + "\' \nТТХ:" +
                ", Может проплыть " + swims + "м. " +
                ", Может пробежать " + run + "м. ";
    }

    public void run(int distance) {
        if (run >= distance) {
            System.out.println(this.type + " по кличке " + this.name + "  - УСПЕШНО пробежал(а) " + distance + "м.");
        } else {
            System.out.println(this.type + " по кличке " + this.name + " ---- сошел(а) с дистанции ---- ");
        }
    }

    public void swim(int distance) {
        if (swims >= distance) {
            System.out.println(this.type + " по кличке " + this.name + "   - УСПЕШНО проплыл(а) " + distance + "м.");
        } else {
            System.out.println(this.type + " по кличке " + this.name + " ---- не выполнил норматив ---- ");
        }
    }

    public void eat(Plate plate) {
    }
}