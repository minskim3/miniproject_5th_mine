package thminiprojthebookminseo.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import thminiprojthebookminseo.domain.*;
import thminiprojthebookminseo.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PointRecharged extends AbstractEvent {

    private Long id;
    private String userId;
    private Integer pointBalance;
    private Integer amount;
    private Date usedAt;

    public PointRecharged(Point aggregate) {
        super(aggregate);
    }

    public PointRecharged() {
        super();
    }
}
//>>> DDD / Domain Event
