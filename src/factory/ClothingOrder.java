package factory;

public class ClothingOrder implements Order{
    @Override
    public void processOrder() {
        System.out.println("processing clothing order");
    }
}
