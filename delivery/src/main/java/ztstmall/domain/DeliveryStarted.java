package ztstmall.domain;

import java.util.*;
import lombok.*;
import ztstmall.domain.*;
import ztstmall.infra.AbstractEvent;

@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Integer orderQty;
    private Long customerId;
    private String orderStatus;
    private String productName;
    private Long productId;

    public DeliveryStarted(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryStarted() {
        super();
    }
}
