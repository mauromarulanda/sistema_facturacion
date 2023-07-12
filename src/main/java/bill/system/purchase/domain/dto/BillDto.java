package bill.system.purchase.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class BillDto {

    private Integer billNumber;

    private Integer idClient;

    private Integer idProduct;

    private Timestamp date;

    private Double total;

    private Double taxes;

    @Override
    public String toString() {
        return "BillDto{" +
                "billNumber=" + billNumber +
                ", date=" + date +
                ", total=" + total +
                ", taxes=" + taxes +
                '}';
    }
}
