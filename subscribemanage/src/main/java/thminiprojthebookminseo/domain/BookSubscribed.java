package thminiprojthebookminseo.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import thminiprojthebookminseo.domain.*;
import thminiprojthebookminseo.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class BookSubscribed extends AbstractEvent {

    private Long id;

    public BookSubscribed(SubscribedBook aggregate) {
        super(aggregate);
    }

    public BookSubscribed() {
        super();
    }
}
//>>> DDD / Domain Event
