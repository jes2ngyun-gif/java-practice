package practice.oop.absrtaction.employee;

public class Main {
    public static void main(String[] args) {

        FullTimeEmployee employee1 = new FullTimeEmployee("콩떡", 3000000, 500000);

        PartTimeEmployee employee2 = new PartTimeEmployee("나비", 12000, 160);

        employee1.printInfo();
        System.out.println("급여 : " + employee1.calculateSalary() + "원");

        System.out.println();

        employee2.printInfo();
        System.out.println("급여 : " + employee2.calculateSalary() + "원");
    }
}
