package thminiprojthebookminseo.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import thminiprojthebookminseo.config.kafka.KafkaProcessor;
import thminiprojthebookminseo.domain.*;

@Service
public class AuthorStatusViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private AuthorStatusRepository authorStatusRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenAuthorSignedUp_then_CREATE_1(
        @Payload AuthorSignedUp authorSignedUp
    ) {
        try {
            if (!authorSignedUp.validate()) return;

            // view 객체 생성
            AuthorStatus authorStatus = new AuthorStatus();
            // view 객체에 이벤트의 Value 를 set 함
            authorStatus.setId(Long.valueOf(authorSignedUp.getAuthorId()));
            authorStatus.setStatus(authorSignedUp.getStatus());
            // view 레파지 토리에 save
            authorStatusRepository.save(authorStatus);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenAuthorApproved_then_UPDATE_1(
        @Payload AuthorApproved authorApproved
    ) {
        try {
            if (!authorApproved.validate()) return;
            // view 객체 조회
            Optional<AuthorStatus> authorStatusOptional = authorStatusRepository.findByAuthorId(
                authorApproved.getAuthorId()
            );

            if (authorStatusOptional.isPresent()) {
                AuthorStatus authorStatus = authorStatusOptional.get();
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                authorStatus.setStatus(authorApproved.getStatus());
                // view 레파지 토리에 save
                authorStatusRepository.save(authorStatus);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenAuthorDisapproved_then_UPDATE_2(
        @Payload AuthorDisapproved authorDisapproved
    ) {
        try {
            if (!authorDisapproved.validate()) return;
            // view 객체 조회
            Optional<AuthorStatus> authorStatusOptional = authorStatusRepository.findByAuthorId(
                authorDisapproved.getAuthorId()
            );

            if (authorStatusOptional.isPresent()) {
                AuthorStatus authorStatus = authorStatusOptional.get();
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                authorStatus.setStatus(authorDisapproved.getStatus());
                // view 레파지 토리에 save
                authorStatusRepository.save(authorStatus);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //>>> DDD / CQRS
}
