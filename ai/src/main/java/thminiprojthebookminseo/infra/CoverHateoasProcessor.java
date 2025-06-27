package thminiprojthebookminseo.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import thminiprojthebookminseo.domain.*;

@Component
public class CoverHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Cover>> {

    @Override
    public EntityModel<Cover> process(EntityModel<Cover> model) {
        return model;
    }
}
