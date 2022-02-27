package factoryPattern.SimpleFactoryPattern;

public class Client {
    public static void main(String[] args) {
        Food chips = FoodFactory.getFoot("Chips");
        Food Pizza = FoodFactory.getFoot("Pizza");
        Food McChicken = FoodFactory.getFoot("McChicken");
        Food cola = FoodFactory.getFoot("Cola");

        if (chips != null){
            chips.getFood();
        }

        if (Pizza != null){
            Pizza.getFood();
        }

        if (McChicken != null){
            McChicken.getFood();
        }

        if (cola != null){
            cola.getFood();
        }
    }
}
