package thminiprojthebookminseo.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import thminiprojthebookminseo.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "summaries", path = "summaries")
public interface SummaryRepository
    extends PagingAndSortingRepository<Summary, Long> {}
