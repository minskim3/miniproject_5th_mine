package thminiprojthebookminseo.domain;

import java.util.*;
import lombok.*;
import thminiprojthebookminseo.domain.*;
import thminiprojthebookminseo.infra.AbstractEvent;

@Data
@ToString
public class AiSummarized extends AbstractEvent {

    private Long summaryId;
    private String writingId;
    private String summaryContext;
    private String tag;
    private Date createdAt;
}
