package thminiprojthebookminseo.domain;

import java.util.*;
import lombok.*;
import thminiprojthebookminseo.domain.*;
import thminiprojthebookminseo.infra.AbstractEvent;

@Data
@ToString
public class BookPublishRequested extends AbstractEvent {

    private Long writingId;
    private Long authorId;
    private String context;
    private String title;
    private String penName;
    private Date registDate;
}
