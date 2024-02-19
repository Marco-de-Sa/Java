package lesson9;

import java.util.List;
import java.util.function.BiPredicate;

public class testBiPredicate {
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
        SalesTxn first = tList.get(0);
        String testState = "CA";

        BiPredicate<SalesTxn,String> stateBiPred = (t, s) -> t.getState().getStr().equals(s);
        System.out.println("check if first is CA");
        System.out.println(stateBiPred.test(first, testState));
    }
}
