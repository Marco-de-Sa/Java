package lesson3;

public class TestImmutability {
    public static void main(String[] args) {
        Employee emp = new Employee(121, "Ron", "ab123", 5000);
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
        System.out.println(emp.toString());
        emp.changeName("Marco de Sa");
        System.out.println(emp.getName());
        emp.raiseSalary(2000.0);
        System.out.println(emp.getSalary());
        System.out.println(emp.toString());
        //above line of code outputs all of the
    }
}