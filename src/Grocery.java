import java.math.BigDecimal;

public class Grocery extends Product{



    public Grocery(String name, BigDecimal price, Double weight) {
        super(name, price, weight,new BigDecimal(2000));
        getDiscountAmount();

    }


}
