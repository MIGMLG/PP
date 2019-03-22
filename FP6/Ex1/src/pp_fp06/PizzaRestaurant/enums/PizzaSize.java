package pp_fp06.PizzaRestaurant.enums;

/**
 *
 * @author NERD-X
 */
public enum PizzaSize {

    /**
     * Tamanho pequeno
     */
    SMALL,

    /**
     * Tamanho médio
     */
    MEDIUM,

    /**
     * Tamanho grande
     */
    BIG;

    /**
     * Metodo para retornar o tamanho da pizza
     * @param size
     * @return
     */
    public static String PizzaSizeToString(PizzaSize size) {
        switch (size) {
            case SMALL:
                return "Pequena";
            case MEDIUM:
                return "Media";
            case BIG:
                return "Grande";
            default:
                return "Invalido";
        }
    }

    /**
     * Metodo para obter o preco da pizza
     * @param size
     * @param defaultPrice
     * @return
     */
    public static float GetPizzaPrice(PizzaSize size, float defaultPrice) {
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
