package thminiprojthebookminseo.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import thminiprojthebookminseo.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "covers", path = "covers")
public interface CoverRepository
    extends PagingAndSortingRepository<Cover, Long> {}
