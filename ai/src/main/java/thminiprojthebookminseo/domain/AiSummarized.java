package thminiprojthebookminseo.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import thminiprojthebookminseo.domain.*;
import thminiprojthebookminseo.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class AiSummarized extends AbstractEvent {

    private Long summaryId;
    private String writingId;
    private String summaryContext;
    private String tag;
    private Date createdAt;

    public AiSummarized(Summary aggregate) {
        super(aggregate);
    }

    public AiSummarized() {
        super();
    }
}
//>>> DDD / Domain Event
