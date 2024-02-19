package lesson10;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class testCollectivePartition {
    public static void main(String[] args) {

        List<Employee> eList = Employee.createShortList();
        Map<Boolean, List<Employee>> gMap = new HashMap<>();

        gMap = eList.stream().collect(Collectors.partitioningBy(e -> e.getRole().equals(Role.EXECUTIVE)));

        System.out.println("are employees executive?:");
        gMap.forEach((k,v) -> {
            System.out.println("\nGroup: " + k);
            v.forEach(Employee::printSummary);
        });

    }
}
