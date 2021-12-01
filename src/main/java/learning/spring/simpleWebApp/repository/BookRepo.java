package learning.spring.simpleWebApp.repository;

import learning.spring.simpleWebApp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, Long> {
}
