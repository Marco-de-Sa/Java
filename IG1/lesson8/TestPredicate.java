package lesson8;

import java.util.function.Predicate;
import java.util.*;

public class TestPredicate {
    public static void main(String[] args) {
        List<SalesTxn> tList = SalesTxn.createTxnList();

        Predicate<SalesTxn> massSales = t -> t.getState().equals(State.MA);
        System.out.println("\n Sales - Stream");

        tList.stream().filter(massSales).forEach(t -> t.printSummary());
    }
}
