package thminiprojthebookminseo.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import thminiprojthebookminseo.AuthormanageApplication;
import thminiprojthebookminseo.domain.AuthorApproved;
import thminiprojthebookminseo.domain.AuthorDisapproved;
import thminiprojthebookminseo.domain.AuthorSignedUp;

@Entity
@Table(name = "Author_table")
@Data
//<<< DDD / Aggregate Root
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long authorId;

    private String name;

    private String loginId;

    private String password;

    private String status;

    private String portfolioUrl;

    @PostPersist
    public void onPostPersist() {
        AuthorApproved authorApproved = new AuthorApproved(this);
        authorApproved.publishAfterCommit();

        AuthorSignedUp authorSignedUp = new AuthorSignedUp(this);
        authorSignedUp.publishAfterCommit();
    }

    @PreUpdate
    public void onPreUpdate() {
        AuthorDisapproved authorDisapproved = new AuthorDisapproved(this);
        authorDisapproved.publishAfterCommit();
    }

    public static AuthorRepository repository() {
        AuthorRepository authorRepository = AuthormanageApplication.applicationContext.getBean(
            AuthorRepository.class
        );
        return authorRepository;
    }

    public void disApprove() {
        //
    }
}
//>>> DDD / Aggregate Root
