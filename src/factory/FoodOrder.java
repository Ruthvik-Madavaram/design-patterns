package factory;

public class FoodOrder implements Order{
    @Override
    public void processOrder() {
        System.out.println("processing food orders");
    }
}
