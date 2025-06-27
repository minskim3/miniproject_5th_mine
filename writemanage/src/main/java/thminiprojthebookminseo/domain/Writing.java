package thminiprojthebookminseo.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import thminiprojthebookminseo.WritemanageApplication;
import thminiprojthebookminseo.domain.BookPublishRequested;

@Entity
@Table(name = "Writing_table")
@Data
//<<< DDD / Aggregate Root
public class Writing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long writingId;

    private Long authorId;

    private String title;

    private String penName;

    private String context;

    private Date registDate;

    @PreUpdate
    public void onPreUpdate() {
        BookPublishRequested bookPublishRequested = new BookPublishRequested(
            this
        );
        bookPublishRequested.publishAfterCommit();
    }

    public static WritingRepository repository() {
        WritingRepository writingRepository = WritemanageApplication.applicationContext.getBean(
            WritingRepository.class
        );
        return writingRepository;
    }
}
//>>> DDD / Aggregate Root
