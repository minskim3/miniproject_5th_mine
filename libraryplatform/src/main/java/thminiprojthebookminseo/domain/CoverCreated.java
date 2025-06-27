package thminiprojthebookminseo.domain;

import java.util.*;
import lombok.*;
import thminiprojthebookminseo.domain.*;
import thminiprojthebookminseo.infra.AbstractEvent;

@Data
@ToString
public class CoverCreated extends AbstractEvent {

    private Long imageId;
    private String writingId;
    private String imageUrl;
}
