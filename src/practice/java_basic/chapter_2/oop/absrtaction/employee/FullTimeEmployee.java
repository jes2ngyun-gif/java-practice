package practice.java_basic.chapter_2.oop.absrtaction.employee;

public class FullTimeEmployee extends Employee {

    private int baseSalary;

    private int bonus;

    public FullTimeEmployee(String name, int baseSalary, int bonus) {

        super(name);

        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public int calculateSalary() {
        return baseSalary + bonus;
    }
}
