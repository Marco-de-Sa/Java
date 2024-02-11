package lesson10;

import java.util.List;
import java.util.Optional;

public class testFirstAndLazy {
    public static void main(String[] args) {
        List<Employee> eList = Employee.createShortList();

        Employee tempEmp = new Employee.Builder().build();
        Optional<Employee> result = eList.stream()
                .peek(e -> System.out.println("Stream start"))
                .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                .peek(e -> System.out.println("Executives"))
                .filter(e -> e.getState().equals("CO"))
                .peek(e -> System.out.println("CO Executives"))
                .findFirst();
    }
}
