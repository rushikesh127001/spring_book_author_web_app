package learning.spring.simpleWebApp.repository;

import learning.spring.simpleWebApp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author, Long> {
}
