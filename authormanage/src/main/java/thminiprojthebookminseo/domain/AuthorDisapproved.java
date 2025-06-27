package thminiprojthebookminseo.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import thminiprojthebookminseo.domain.*;
import thminiprojthebookminseo.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class AuthorDisapproved extends AbstractEvent {

    private Long authorId;
    private String status;

    public AuthorDisapproved(Author aggregate) {
        super(aggregate);
    }

    public AuthorDisapproved() {
        super();
    }
}
//>>> DDD / Domain Event
