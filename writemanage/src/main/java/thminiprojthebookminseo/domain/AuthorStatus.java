package thminiprojthebookminseo.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "AuthorStatus_table")
@Data
public class AuthorStatus {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long authorId;

    private String status;
}
