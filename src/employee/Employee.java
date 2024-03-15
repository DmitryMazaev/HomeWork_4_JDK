package employee;
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
public class Employee {

    private String id;
    private String telephoneNumber;
    private String employeeName;
    private int experience;

    public Employee(String id, String telephoneNumber, String employeeName, int experience) {
        this.id = id;
        this.telephoneNumber = telephoneNumber;
        this.employeeName = employeeName;
        this.experience = experience;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTelephoneNumber() {
        return telephoneNumber;
    }
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    @Override
    public String toString() {
        return "Сотрудник{" +
                "Табельный номер = " + id + ", " +
                "номер телефона = " + telephoneNumber + ", " +
                "имя сотрудника = " + employeeName + ", " +
                "стаж = " + experience +
                '}';
    }
}
