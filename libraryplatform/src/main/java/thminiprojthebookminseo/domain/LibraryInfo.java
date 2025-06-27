package thminiprojthebookminseo.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import thminiprojthebookminseo.LibraryplatformApplication;
import thminiprojthebookminseo.domain.CountIncreased;
import thminiprojthebookminseo.domain.Published;

@Entity
@Table(name = "LibraryInfo_table")
@Data
//<<< DDD / Aggregate Root
public class LibraryInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookId;

    private String bookTitle;

    private String penName;

    private Integer selectCount;

    private Date publishDate;

    private String summary;

    private String classficationTpe;

    private String bookimage;

    public static LibraryInfoRepository repository() {
        LibraryInfoRepository libraryInfoRepository = LibraryplatformApplication.applicationContext.getBean(
            LibraryInfoRepository.class
        );
        return libraryInfoRepository;
    }

    //<<< Clean Arch / Port Method
    public static void increaseCount(PointDecreased pointDecreased) {
        //implement business logic here:

        /** Example 1:  new item 
        LibraryInfo libraryInfo = new LibraryInfo();
        repository().save(libraryInfo);

        CountIncreased countIncreased = new CountIncreased(libraryInfo);
        countIncreased.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(pointDecreased.get???()).ifPresent(libraryInfo->{
            
            libraryInfo // do something
            repository().save(libraryInfo);

            CountIncreased countIncreased = new CountIncreased(libraryInfo);
            countIncreased.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void publish(AiSummarized aiSummarized) {
        //implement business logic here:

        /** Example 1:  new item 
        LibraryInfo libraryInfo = new LibraryInfo();
        repository().save(libraryInfo);

        Published published = new Published(libraryInfo);
        published.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        // if aiSummarized.aiGpt4_1MiniId exists, use it
        
        // ObjectMapper mapper = new ObjectMapper();
        // Map<, Object> summaryMap = mapper.convertValue(aiSummarized.getAiGpt4_1MiniId(), Map.class);

        repository().findById(aiSummarized.get???()).ifPresent(libraryInfo->{
            
            libraryInfo // do something
            repository().save(libraryInfo);

            Published published = new Published(libraryInfo);
            published.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void publish(CoverCreated coverCreated) {
        //implement business logic here:

        /** Example 1:  new item 
        LibraryInfo libraryInfo = new LibraryInfo();
        repository().save(libraryInfo);

        Published published = new Published(libraryInfo);
        published.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        // if coverCreated.aiDallEId exists, use it
        
        // ObjectMapper mapper = new ObjectMapper();
        // Map<, Object> coverMap = mapper.convertValue(coverCreated.getAiDallEId(), Map.class);

        repository().findById(coverCreated.get???()).ifPresent(libraryInfo->{
            
            libraryInfo // do something
            repository().save(libraryInfo);

            Published published = new Published(libraryInfo);
            published.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void publish(BookPublishRequested bookPublishRequested) {
        //implement business logic here:

        /** Example 1:  new item 
        LibraryInfo libraryInfo = new LibraryInfo();
        repository().save(libraryInfo);

        Published published = new Published(libraryInfo);
        published.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(bookPublishRequested.get???()).ifPresent(libraryInfo->{
            
            libraryInfo // do something
            repository().save(libraryInfo);

            Published published = new Published(libraryInfo);
            published.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
