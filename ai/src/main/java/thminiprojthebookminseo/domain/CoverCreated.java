package thminiprojthebookminseo.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import thminiprojthebookminseo.domain.*;
import thminiprojthebookminseo.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class CoverCreated extends AbstractEvent {

    private Long imageId;
    private String writingId;
    private String imageUrl;

    public CoverCreated(Cover aggregate) {
        super(aggregate);
    }

    public CoverCreated() {
        super();
    }
}
//>>> DDD / Domain Event
