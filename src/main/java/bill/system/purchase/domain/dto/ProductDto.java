package bill.system.purchase.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {

    private Integer codeProduct;

    private String productDescription;

    private Double priceProduct;


    @Override
    public String toString() {
        return "ProductDto{" +
                "codeProduct='" + codeProduct + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", priceProduct=" + priceProduct +
                '}';
    }
}
