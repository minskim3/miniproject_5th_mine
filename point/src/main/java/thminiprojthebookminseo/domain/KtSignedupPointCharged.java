package thminiprojthebookminseo.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import thminiprojthebookminseo.domain.*;
import thminiprojthebookminseo.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class KtSignedupPointCharged extends AbstractEvent {

    private Long id;
    private String userId;
    private Integer ktSignupPoint;
    private Date signupDate;
    private String isKt;

    public KtSignedupPointCharged(Point aggregate) {
        super(aggregate);
    }

    public KtSignedupPointCharged() {
        super();
    }
}
//>>> DDD / Domain Event
