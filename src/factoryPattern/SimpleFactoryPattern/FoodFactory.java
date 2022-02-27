package factoryPattern.SimpleFactoryPattern;

public class FoodFactory {
    public static Food getFoot(String type){
        if ("Chips".equals(type)){
            return new Chips();
        }else if ("Pizza".equalsIgnoreCase(type)){
            return new Pizza();
        }else if("McChicken".equals(type)){
            return new McChicken();
        }else if("Cola".equals(type)){
            return new Cola();
        } else {
            return null;
        }
    }
}
