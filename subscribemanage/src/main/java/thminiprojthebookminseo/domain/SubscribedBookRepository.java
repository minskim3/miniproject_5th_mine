package thminiprojthebookminseo.domain;

import java.util.Date;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import thminiprojthebookminseo.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "subscribedBooks",
    path = "subscribedBooks"
)
public interface SubscribedBookRepository
    extends PagingAndSortingRepository<SubscribedBook, Long> {}
