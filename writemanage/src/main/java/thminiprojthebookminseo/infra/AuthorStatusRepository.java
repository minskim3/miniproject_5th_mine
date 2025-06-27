package thminiprojthebookminseo.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import thminiprojthebookminseo.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "authorStatuses",
    path = "authorStatuses"
)
public interface AuthorStatusRepository
    extends PagingAndSortingRepository<AuthorStatus, Long> {}
