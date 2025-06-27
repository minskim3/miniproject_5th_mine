package thminiprojthebookminseo.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import thminiprojthebookminseo.config.kafka.KafkaProcessor;
import thminiprojthebookminseo.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    LibraryInfoRepository libraryInfoRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='PointDecreased'"
    )
    public void wheneverPointDecreased_IncreaseCount(
        @Payload PointDecreased pointDecreased
    ) {
        PointDecreased event = pointDecreased;
        System.out.println(
            "\n\n##### listener IncreaseCount : " + pointDecreased + "\n\n"
        );

        // Sample Logic //
        LibraryInfo.increaseCount(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='AiSummarized'"
    )
    public void wheneverAiSummarized_Publish(
        @Payload AiSummarized aiSummarized
    ) {
        AiSummarized event = aiSummarized;
        System.out.println(
            "\n\n##### listener Publish : " + aiSummarized + "\n\n"
        );

        // Sample Logic //
        LibraryInfo.publish(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='CoverCreated'"
    )
    public void wheneverCoverCreated_Publish(
        @Payload CoverCreated coverCreated
    ) {
        CoverCreated event = coverCreated;
        System.out.println(
            "\n\n##### listener Publish : " + coverCreated + "\n\n"
        );

        // Sample Logic //
        LibraryInfo.publish(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='BookPublishRequested'"
    )
    public void wheneverBookPublishRequested_Publish(
        @Payload BookPublishRequested bookPublishRequested
    ) {
        BookPublishRequested event = bookPublishRequested;
        System.out.println(
            "\n\n##### listener Publish : " + bookPublishRequested + "\n\n"
        );

        // Sample Logic //
        LibraryInfo.publish(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
