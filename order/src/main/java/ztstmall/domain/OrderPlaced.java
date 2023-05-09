package ztstmall.domain;

import java.util.*;
import lombok.*;
import ztstmall.domain.*;
import ztstmall.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private Integer orderQty;
    private Long customerId;
    private String productName;
    private Long productId;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
