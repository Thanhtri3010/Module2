package case_study_module2.models.person;


import case_study_module2.comma.Comma;

public class Employee extends Person {
    private String level;
    private String position;
    private int salary;

    public Employee() {
    }

    @Override
    public String getInfo() {
        return super.getId() + Comma.COMMA +
                super.getName() + Comma.COMMA +
                super.getAge() + Comma.COMMA +
                super.getSex() + Comma.COMMA +
                super.getIdCard() + Comma.COMMA +
                super.getEmail() + Comma.COMMA +
                this.getLevel() + Comma.COMMA +
                this.getPosition() + Comma.COMMA +
                this.getSalary() + Comma.COMMA + "\n";
    }

    public Employee(String level, String position, int salary) {
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(int id, String name, int age, String sex, String idCard, String email, String level, String position, int salary) {
        super(id, name, age, sex, idCard, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
