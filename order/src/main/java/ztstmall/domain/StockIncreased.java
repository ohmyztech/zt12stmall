package ztstmall.domain;

import java.util.*;
import lombok.*;
import ztstmall.domain.*;
import ztstmall.infra.AbstractEvent;

@Data
@ToString
public class StockIncreased extends AbstractEvent {

    private Long id;
    private Integer stock;
}
