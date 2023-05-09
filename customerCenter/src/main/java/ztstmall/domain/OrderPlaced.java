package ztstmall.domain;

import java.util.*;
import lombok.Data;
import ztstmall.infra.AbstractEvent;

@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private Integer orderQty;
    private Long customerId;
    private String productName;
    private Long productId;
}
