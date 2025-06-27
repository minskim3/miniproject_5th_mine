package thminiprojthebookminseo.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import thminiprojthebookminseo.domain.*;
import thminiprojthebookminseo.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class SubscriberCreated extends AbstractEvent {

    private Long id;
    private String name;

    public SubscriberCreated(Subscriber aggregate) {
        super(aggregate);
    }

    public SubscriberCreated() {
        super();
    }
}
//>>> DDD / Domain Event
