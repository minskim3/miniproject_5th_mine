package thminiprojthebookminseo.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import thminiprojthebookminseo.AiApplication;
import thminiprojthebookminseo.domain.CoverCreated;

@Entity
@Table(name = "Cover_table")
@Data
//<<< DDD / Aggregate Root
public class Cover {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long imageId;

    private Long writingId;

    private Long authorId;

    private String coverUrl;

    private Date createdAt;

    public static CoverRepository repository() {
        CoverRepository coverRepository = AiApplication.applicationContext.getBean(
            CoverRepository.class
        );
        return coverRepository;
    }

    //<<< Clean Arch / Port Method
    public static void generateCover(
        BookPublishRequested bookPublishRequested
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        Cover cover = new Cover();
        repository().save(cover);

        CoverCreated coverCreated = new CoverCreated(cover);
        coverCreated.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(bookPublishRequested.get???()).ifPresent(cover->{
            
            cover // do something
            repository().save(cover);

            CoverCreated coverCreated = new CoverCreated(cover);
            coverCreated.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
