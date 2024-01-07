package lesson4;

public class EmployeesLesson_4 {
    private String fio, email;
    private int age;

    public int getAge() {
        return age;
    }

    public EmployeesLesson_4(String fio, String email, int age) {
        this.fio = fio;
        this.email = email;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("fio " + fio + "email" + email + "age " + age);
    }
}