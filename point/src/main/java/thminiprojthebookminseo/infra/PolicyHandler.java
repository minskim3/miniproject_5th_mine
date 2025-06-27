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
    PointRepository pointRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='BookSubscribed'"
    )
    public void wheneverBookSubscribed_PointDecrease(
        @Payload BookSubscribed bookSubscribed
    ) {
        BookSubscribed event = bookSubscribed;
        System.out.println(
            "\n\n##### listener PointDecrease : " + bookSubscribed + "\n\n"
        );

        // Sample Logic //
        Point.pointDecrease(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='SubscriberCreated'"
    )
    public void wheneverSubscriberCreated_Signup(
        @Payload SubscriberCreated subscriberCreated
    ) {
        SubscriberCreated event = subscriberCreated;
        System.out.println(
            "\n\n##### listener Signup : " + subscriberCreated + "\n\n"
        );

        // Sample Logic //
        Point.signup(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
