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
import thminiprojthebookminseo.domain.AiSummarized;

@Entity
@Table(name = "Summary_table")
@Data
//<<< DDD / Aggregate Root
public class Summary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long summaryId;

    private String writingId;

    private String summaryContext;

    private String tag;

    private Date createdAt;

    public static SummaryRepository repository() {
        SummaryRepository summaryRepository = AiApplication.applicationContext.getBean(
            SummaryRepository.class
        );
        return summaryRepository;
    }

    //<<< Clean Arch / Port Method
    public static void summarizeContext(
        BookPublishRequested bookPublishRequested
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        Summary summary = new Summary();
        repository().save(summary);

        AiSummarized aiSummarized = new AiSummarized(summary);
        aiSummarized.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(bookPublishRequested.get???()).ifPresent(summary->{
            
            summary // do something
            repository().save(summary);

            AiSummarized aiSummarized = new AiSummarized(summary);
            aiSummarized.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
