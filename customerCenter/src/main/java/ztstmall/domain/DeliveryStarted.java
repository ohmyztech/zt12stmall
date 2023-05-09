package ztstmall.domain;

import java.util.*;
import lombok.Data;
import ztstmall.infra.AbstractEvent;

@Data
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Integer orderQty;
    private Long customerId;
    private String orderStatus;
    private String productName;
    private Long productId;
}
