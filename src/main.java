import java.math.BigDecimal;

public class main {
    public static void main(String[] args) {

        Product beauty = new Beauty("beauty", new BigDecimal(30000), 2.0);
        Product grocery = new Grocery("grocery", new BigDecimal(20000), 3.0);
        Product largeAppliance = new LargeAppliance("largeAppliance", new BigDecimal(50000), 5.0);

        Cart cart = new Cart(new Product[] {beauty, grocery, largeAppliance});
        BigDecimal totalDeliveryCharge = cart.calculateDeliveryCharge();
        System.out.println(totalDeliveryCharge);
    }
}
