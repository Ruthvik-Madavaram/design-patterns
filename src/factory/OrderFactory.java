package factory;

public class OrderFactory {
    public static Order createOrder(String orderType) {
        switch (orderType) {
            case "Food":
                return new FoodOrder();
            case "Clothing":
                return new ClothingOrder();
            default:
                throw new IllegalArgumentException("We do not process orders of type: " + orderType);
        }
    }
}
