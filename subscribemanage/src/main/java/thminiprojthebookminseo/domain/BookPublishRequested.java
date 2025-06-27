package thminiprojthebookminseo.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import thminiprojthebookminseo.infra.AbstractEvent;

@Data
public class BookPublishRequested extends AbstractEvent {

    private Long writingId;
    private Long authorId;
    private String context;
    private String title;
    private String penName;
    private Date registDate;
}
