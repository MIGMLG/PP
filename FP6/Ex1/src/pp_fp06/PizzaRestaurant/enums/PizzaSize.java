package pp_fp06.PizzaRestaurant.enums;

public enum PizzaSize {
    SMALL, MEDIUM, BIG;

    public static String PizzaSizeToString(PizzaSize size) {
        switch (size) {
            case SMALL:
                return "This Pizza is small.";
            case MEDIUM:
                return "This Pizza is medium.";
            case BIG:
                return "This Pizza is big.";
            default:
                return "The size is not valid";
        }
    }

    public static float getPizzaPrice(PizzaSize size, float defaultPrice) {
        switch (size) {
            case SMALL:
                return (float) (defaultPrice * 0.5);
            case MEDIUM:
                return (float) defaultPrice;
            case BIG:
                return (float) (defaultPrice * 1.5);
            default:
                System.out.println("The size is not valid");
                return  defaultPrice;
        }
    }
}
