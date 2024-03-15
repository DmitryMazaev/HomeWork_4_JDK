import employee.Employee;
import employee.EmployeeList;

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

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("П132", "322-12-99", "Петров Петр Петрович", 12);
        Employee employee2 = new Employee("П168", "302-72-29", "Иванова Людмила Павловна", 6);
        Employee employee3 = new Employee("П542", "320-14-00", "Керсен Давид Иванович", 2);
        Employee employee4 = new Employee("П755", "392-10-10", "Львова Зинаида Михайловна", 30);
        EmployeeList employeeList = new EmployeeList();
        employeeList.addEmployee(employee1);
        employeeList.addEmployee(employee2);
        employeeList.addEmployee(employee3);
        employeeList.addEmployee(employee4);

        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Справочник сотрудников предприятия. Выберите действие: ");
            System.out.println("1 - поиск по стажу, 2 - вывод номера телефона по имени, 3 - поиск по табельному номеру, 4 - добавление нового сотрудника, 5 - вывести список");
            int number = in.nextInt();
            try {
                if (number == 1) {
                    employeeList.experienceSearch();
                }
                if (number == 2) {
                    employeeList.getTelephone();
                }
                if (number == 3) {
                    employeeList.IdSearch();
                }
                if (number == 4) {
                    employeeList.createNewEmployee();
                }
                if (number == 5) {
                    for (Employee employee : employeeList.getEmployees()) {
                        System.out.println(employee);
                    }
                }
                if (number > 5) {
                    System.out.println("Ошибка: введено некорректное число");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введено некорректное значение");
            }
        }
    }
}