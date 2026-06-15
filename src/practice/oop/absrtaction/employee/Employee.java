package practice.oop.absrtaction.employee;

public abstract class Employee {

    private String name;

    public Employee(String name) {

        if (name == null || name.isEmpty()) {
            this.name = "이름없음";

        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("직원 이름 : " + name);
    }

    public abstract int calculateSalary();
}
