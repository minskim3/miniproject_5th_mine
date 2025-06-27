package thminiprojthebookminseo.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import thminiprojthebookminseo.domain.*;
import thminiprojthebookminseo.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class CountIncreased extends AbstractEvent {

    private Long id;

    public CountIncreased(LibraryInfo aggregate) {
        super(aggregate);
    }

    public CountIncreased() {
        super();
    }
}
//>>> DDD / Domain Event
