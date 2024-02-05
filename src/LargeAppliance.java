import java.math.BigDecimal;

public class LargeAppliance extends Product{


    public LargeAppliance(String name, BigDecimal price, Double weight) {
        super(name, price, weight,new BigDecimal(0));
        getDiscountAmount();
    }

}
