package learning.spring.simpleWebApp.repository;


import org.springframework.data.repository.CrudRepository;
import learning.spring.simpleWebApp.domain.Publisher;

public interface PublisherRepo extends CrudRepository<Publisher,Long> {
}
