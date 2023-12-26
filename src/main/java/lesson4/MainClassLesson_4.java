package lesson4;
public class MainClassLesson_4 {
    public static void main (String[] args) {



        EmployeesLesson_4[] employees = new EmployeesLesson_4[5];
        employees[0] = new EmployeesLesson_4("Petrov", "Petrov@mail.ru", 45);
        employees[1] = new EmployeesLesson_4("Petrov1", "Petrov@mail.ru", 36);
        employees[2] = new EmployeesLesson_4("Petrov2", "Petrov@mail.ru", 52);
        employees[3] = new EmployeesLesson_4("Petrov3", "Petrov@mail.ru", 27);
        employees[4] = new EmployeesLesson_4("Petrov4", "Petrov@mail.ru", 48);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].printInfo();

                employees[1].printInfo();

            }

        }
    }

}
