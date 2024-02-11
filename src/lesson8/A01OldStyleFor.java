package lesson8;

import java.util.List;

public class A01OldStyleFor {

    public static void main(String[] args) {
        
        List<SalesTxn> tList = SalesTxn.createTxnList();
        
        System.out.println("\n=== Print List with for ===");
        for(SalesTxn t:tList){
            t.printSummary();
        }        
    }
}