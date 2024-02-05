import java.math.BigDecimal;

public class Product implements Promotion {
    private String name;
    private BigDecimal price;
    private Double weight;

    private BigDecimal discount;


    public Product() {
    }

    public Product(String name, BigDecimal price, Double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        discount = BigDecimal.ZERO;
    }

    public Product(String name, BigDecimal price, Double weight,BigDecimal discount) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Double getWeight() {
        return weight;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    @Override
    public BigDecimal getDiscountAmount() {

        BigDecimal goodsPrice;

        goodsPrice = price.subtract(discount);

        return goodsPrice;
    }
}
