package thminiprojthebookminseo.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import thminiprojthebookminseo.domain.*;

@Component
public class WritingHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Writing>> {

    @Override
    public EntityModel<Writing> process(EntityModel<Writing> model) {
        return model;
    }
}
