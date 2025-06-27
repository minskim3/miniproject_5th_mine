package thminiprojthebookminseo.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import thminiprojthebookminseo.infra.AbstractEvent;

@Data
public class AuthorSignedUp extends AbstractEvent {

    private Long authorId;
    private String status;
}
