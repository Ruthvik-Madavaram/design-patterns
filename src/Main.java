import factory.Order;
import factory.OrderFactory;
import singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = new Singleton();
        singleton.demo();

        try {
            //Factory Design Pattern
            Order order1 = OrderFactory.createOrder("Food");
            order1.processOrder();

            Order order2 = OrderFactory.createOrder("Clothing");
            order2.processOrder();

            Order order3 = OrderFactory.createOrder("Electronics");
            order3.processOrder();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}