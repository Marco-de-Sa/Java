package lesson9;

import java.util.List;

public class Consumer {
  
  public static void main(String[] args){ 

    List<SalesTxn> tList = SalesTxn.createTxnList();
    SalesTxn first = tList.get(0);
    
    java.util.function.Consumer<SalesTxn> buyerConsumer = t ->
        System.out.println("Id: " + t.getTxnId() 
            + " Buyer: " + t.getBuyerName());
    
    System.out.println("== Buyers - Lambda");
    tList.stream().forEach(buyerConsumer);
    
    System.out.println("== First Buyer - Method");
    buyerConsumer.accept(first);
  }
}
