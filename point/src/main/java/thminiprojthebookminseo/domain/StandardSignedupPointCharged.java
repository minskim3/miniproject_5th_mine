package thminiprojthebookminseo.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import thminiprojthebookminseo.domain.*;
import thminiprojthebookminseo.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class StandardSignedupPointCharged extends AbstractEvent {

    private Long id;
    private String userId;
    private Integer standardSignupPoint;
    private Date signupDate;
    private String isKt;

    public StandardSignedupPointCharged(Point aggregate) {
        super(aggregate);
    }

    public StandardSignedupPointCharged() {
        super();
    }
}
//>>> DDD / Domain Event
