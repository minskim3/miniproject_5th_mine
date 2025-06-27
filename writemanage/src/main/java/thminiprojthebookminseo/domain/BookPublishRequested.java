package thminiprojthebookminseo.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import thminiprojthebookminseo.domain.*;
import thminiprojthebookminseo.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class BookPublishRequested extends AbstractEvent {

    private Long writingId;
    private Long authorId;
    private String context;
    private String title;
    private String penName;
    private Date registDate;

    public BookPublishRequested(Writing aggregate) {
        super(aggregate);
    }

    public BookPublishRequested() {
        super();
    }
}
//>>> DDD / Domain Event
