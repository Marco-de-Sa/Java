package lesson9;

public class DoubleFunction {

  public static void main(String[] args) {
        
    DoubleFunction test = new DoubleFunction();

    java.util.function.DoubleFunction<String> calc =
          t -> String.valueOf(t * 3);
        
    String result = calc.apply(20);
    System.out.println("New value is: " + result);        
  }      
}
