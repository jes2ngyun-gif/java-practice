package practice.oop.absrtaction.employee;

public class PartTimeEmployee extends Employee {

    private int hourlyPay;

    private int workHour;

    public PartTimeEmployee(String name, int hourlyPay, int workHour) {

        super(name);

        this.hourlyPay = hourlyPay;
        this.workHour = workHour;
    }

    @Override
    public int calculateSalary() {
        return hourlyPay * workHour;
    }
}
