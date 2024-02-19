package lesson9;

import java.util.List;

public class Function {
  
  public static void main(String[] args){ 

    List<SalesTxn> tList = SalesTxn.createTxnList();
    SalesTxn first = tList.get(0);
        
    java.util.function.Function<SalesTxn, String> buyerFunction =
        t -> t.getBuyerName();
    
    System.out.println("\n== First Buyer");
    System.out.println(buyerFunction.apply(first));      
  }
}