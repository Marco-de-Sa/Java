package lesson10;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class testCollectToMap {
    public static void main(String[] args) {

        List<Employee> eList = Employee.createShortList();

        Map<String, String> gMap = new HashMap<>();

        gMap = eList.stream()
                .collect(Collectors.toMap(Employee::getEmail,
                        e -> e.getDept()));
        gMap.forEach((k,v) -> {System.out.println("Email: " + k + " Department: " + v);
        });

    }
}
