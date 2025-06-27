package thminiprojthebookminseo.domain;

import java.util.*;
import lombok.*;
import thminiprojthebookminseo.domain.*;
import thminiprojthebookminseo.infra.AbstractEvent;

@Data
@ToString
public class SubscriberCreated extends AbstractEvent {

    private Long id;
    private String name;
}
