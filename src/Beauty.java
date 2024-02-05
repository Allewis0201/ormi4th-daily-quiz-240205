import java.math.BigDecimal;

public class Beauty extends Product{

    private BigDecimal totalCharge;

    public Beauty(String name, BigDecimal price, Double weight) {
        super(name, price, weight,new BigDecimal(10000));
        getDiscountAmount();

    }



}
