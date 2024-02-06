import java.math.BigDecimal;

public class Cart {
    private Product[] products;



    public Cart(Product[] products)
    {
        this.products = products;
    }


    public BigDecimal calculateDeliveryCharge()
    {
        BigDecimal weightDeliveryCharge;
        BigDecimal totalDeliveryCharge = new BigDecimal("0");



        for(Product goods : products)
        {
            if(goods.getWeight() < DeliveryChargeProvider.LIGHT_WEIGHT_CUT)
            {
                weightDeliveryCharge = DeliveryChargeProvider.LIGHT_WEIGHT_CHARGE;
            }
            else if(goods.getWeight() < DeliveryChargeProvider.HEAVY_WEIGHT_CUT)
            {
                weightDeliveryCharge = DeliveryChargeProvider.MEDIUM_WEIGHT_CHARGE;
            }
            else
            {
                weightDeliveryCharge = DeliveryChargeProvider.HEAVY_WEIGHT_CHARGE;
            }


            if((goods.getPrice().subtract(goods.getDiscount())).compareTo(DeliveryChargeProvider.CHEAP_PRICE_CUT) < 0)
            {
                totalDeliveryCharge = totalDeliveryCharge.add(weightDeliveryCharge);

            }
            else if((goods.getPrice().subtract(goods.getDiscount())).compareTo(DeliveryChargeProvider.EXPENSIVE_PRICE_CUT) < 0)
            {
                totalDeliveryCharge = totalDeliveryCharge.add(weightDeliveryCharge.subtract(DeliveryChargeProvider.PRICE_CHARGE_DISCOUNT));

            }
            else
            {
                totalDeliveryCharge = totalDeliveryCharge.add(BigDecimal.ZERO);
            }

        }

        return totalDeliveryCharge;
    }
}
