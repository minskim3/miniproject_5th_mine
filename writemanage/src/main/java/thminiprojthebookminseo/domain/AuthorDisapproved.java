package thminiprojthebookminseo.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import thminiprojthebookminseo.infra.AbstractEvent;

@Data
public class AuthorDisapproved extends AbstractEvent {

    private Long authorId;
    private String status;
}
