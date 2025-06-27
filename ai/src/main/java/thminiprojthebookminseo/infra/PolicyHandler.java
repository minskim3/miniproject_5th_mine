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
    CoverRepository coverRepository;

    @Autowired
    SummaryRepository summaryRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='BookPublishRequested'"
    )
    public void wheneverBookPublishRequested_GenerateCover(
        @Payload BookPublishRequested bookPublishRequested
    ) {
        BookPublishRequested event = bookPublishRequested;
        System.out.println(
            "\n\n##### listener GenerateCover : " +
            bookPublishRequested +
            "\n\n"
        );

        // Sample Logic //
        Cover.generateCover(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='BookPublishRequested'"
    )
    public void wheneverBookPublishRequested_SummarizeContext(
        @Payload BookPublishRequested bookPublishRequested
    ) {
        BookPublishRequested event = bookPublishRequested;
        System.out.println(
            "\n\n##### listener SummarizeContext : " +
            bookPublishRequested +
            "\n\n"
        );

        // Sample Logic //
        Summary.summarizeContext(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
