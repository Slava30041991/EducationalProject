package lesson5;

public class Plate {
    public int food;

    public Plate(int food) {
        super();
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void increaseFood(int x) {
        food += x;
    }

    public void info() {
        System.out.println("Всего еды: " + food);
    }
}
