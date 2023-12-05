package exercise3;

public class ShoppingCart {

    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith", message;
        double price = 21.99, tax = 1.04;
        int quantity = 2;

        String items[];
        items = new String[4];
        items[0] = "Shirt";
        items[1] = "Belt";
        items[2] = "Scarf";
        items[3] = "Skirt";
        
        double prices[] = {150.45, 50.0, 67.99, 89.99};
        

        message = custName + " wants to purchase " + items.length + " items.";
        System.out.println(message);

        // Iterate through and print out the items from the items array
        System.out.println("Items purchased: ");

        for (int i = 0; i < items.length-1; i++) {
            System.out.print(items[i] + " R" + prices[i] + ", ");
        }
        System.out.println(items[items.length-1] + " R" + prices[items.length-1]);
    }
}
