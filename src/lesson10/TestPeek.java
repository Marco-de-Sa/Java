package lesson10;

import java.util.List;

public class TestPeek {
    public static void main(String[] args) {
        List<Employee> eList = Employee.createShortList();

        System.out.println("\n== CO Bonuses ==");
        eList.stream()
                .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                .filter(e -> e.getState().equals("CO"))
                .peek(e -> System.out.print("Name: " + e.getGivenName() + " " + e.getSurName()))
                .map(e -> e.getSalary() * Bonus.byRole(e.getRole()))
                .forEach( s -> System.out.printf("  Bonus paid: $%,6.2f %n", s));
    }
}
