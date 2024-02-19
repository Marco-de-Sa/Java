package lesson10;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author oracle
 */
public class A14CollectGrouping {
    
    public static void main(String[] args) {
        
        List<Employee> eList = Employee.createShortList();
        
        Map<String, List<Employee>> gMap = new HashMap<>();
       
        // Collect CO Executives
        gMap = eList.stream()
            .collect(Collectors.groupingBy(Employee::getDept));        

        System.out.println("Employees by Department");
        gMap.forEach((k,v) -> {
            System.out.println("Department: " + k);
            v.forEach(Employee::printSummary);
        });
                
    }
    
}
