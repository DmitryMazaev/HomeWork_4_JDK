package employee;
import java.util.ArrayList;
import java.util.Scanner;

/*
Создать справочник сотрудников
Необходимо:
Создать класс справочник сотрудников, который содержит внутри
коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
-Табельный номер
-Номер телефона
-Имя
-Стаж
Добавить метод, который ищет сотрудника по стажу (может быть список)
Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
Добавить метод, который ищет сотрудника по табельному номеру
Добавить метод добавления нового сотрудника в справочник
 */
public class EmployeeList {
    Employee employee;
    String id = "табельный номер";
    String telephone = "номер телефона";
    String name = "имя";
    String experience = "стаж";
    private ArrayList<Employee> employees = new ArrayList<>();
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public Employee createNewEmployee () {
        System.out.println("Метод 'Создание нового сотрудника'");
        String employeeId = createStringParameter(id);
        String employeeTelephone = createStringParameter(telephone);
        String employeeName = createStringParameter(name);
        int employeeExperience = createIntParametrer(experience);
        employee = new Employee(employeeId, employeeTelephone, employeeName, employeeExperience);
        employees.add(employee);
        System.out.println("Сотрудник добавлен!");
        return employee;
    }
    public String createStringParameter(String str) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите %s сотрудника: ", str);
        String parameter = in.next();
        return parameter;
    }
    public int createIntParametrer(String str) {
        int parameter = 0;
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.printf("Введите %s сотрудника: ", str);
            String input = in.next();
            try {
                parameter = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введено некорректное число");
            }
        }
        return parameter;
    }
    public ArrayList<Employee> getEmployees() {
        return employees;
    }
    public void experienceSearch() {
        System.out.println("Метод 'Поиск по стажу'");
        int experienceMin = 0;
        int experienceMax = 0;
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите минимальный стаж сотрудника сотрудника: ");
            String input1 = in.next();
            while (true) {
                if (Integer.parseInt(input1) > 0) {
                    try {
                        experienceMin = Integer.parseInt(input1);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка: введено некорректное число");
                    }
                }
            }
            System.out.print("Введите максимальный стаж сотрудника сотрудника: ");
            String input2 = in.next();
            while (true) {
                if (Integer.parseInt(input2) >= experienceMin) {
                    try {
                        experienceMax = Integer.parseInt(input2);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка: введено некорректное число");
                    }
                }
            }
            System.out.println("Сотрудники, имеющие подходящий стаж: ");
            for (Employee employee: employees) {
                if (employee.getExperience() >= experienceMin && employee.getExperience() <= experienceMax) {
                    System.out.println(employee);
                }
            }
            break;
        }

    }
    public void getTelephone() {
        System.out.println("Метод 'Поиск номера телефона по имени сотрудника'");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя сотрудника: ");
        String input = in.next();
        for (Employee employee: employees) {
            if (employee.getEmployeeName().contains(input)) {
                System.out.println(employee);
            }
        }
    }
    public void IdSearch() {
        System.out.println("Метод 'Поиск по табельному номеру сотрудника'");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите табельный номер сотрудника: ");
        String input = in.next();
        for (Employee employee: employees) {
            if (employee.getId().equals(input)) {
                System.out.println(employee);
            }
        }
    }
}
