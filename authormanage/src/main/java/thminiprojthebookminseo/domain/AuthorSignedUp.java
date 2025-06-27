package thminiprojthebookminseo.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import thminiprojthebookminseo.domain.*;
import thminiprojthebookminseo.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class AuthorSignedUp extends AbstractEvent {

    private Long authorId;
    private String status;

    public AuthorSignedUp(Author aggregate) {
        super(aggregate);
    }

    public AuthorSignedUp() {
        super();
    }
}
//>>> DDD / Domain Event
