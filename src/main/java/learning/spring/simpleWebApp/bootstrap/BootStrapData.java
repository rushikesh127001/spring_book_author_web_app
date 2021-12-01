package learning.spring.simpleWebApp.bootstrap;

import learning.spring.simpleWebApp.domain.Author;
import learning.spring.simpleWebApp.domain.Book;
import learning.spring.simpleWebApp.domain.Publisher;
import learning.spring.simpleWebApp.repository.AuthorRepo;
import learning.spring.simpleWebApp.repository.BookRepo;
import learning.spring.simpleWebApp.repository.PublisherRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepo authorRepo;
    private final BookRepo bookRepo;
    private final PublisherRepo publisherRepo;

    public BootStrapData(AuthorRepo authorRepo, BookRepo bookRepo, PublisherRepo publisherRepo) {
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepo;
        this.publisherRepo = publisherRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("booostap testing");

        Publisher firstPublisher=new Publisher();
        firstPublisher.setName("myPublisher");
        firstPublisher.setCity("Banglor");
        firstPublisher.setZip("5600");
        publisherRepo.save(firstPublisher);



        Book firstBook=new Book();
        firstBook.setBookName("firstBookName");
        firstBook.setIsbn("12345");
        firstBook.setPublisher(firstPublisher);


        Author firstauthor=new Author();
        firstauthor.setFirstName("firstPubNaame");
        firstauthor.setLastName("firstLastname");

       // firstBook.getAuthors().add(firstauthor);
        firstauthor.getBooks().add(firstBook);
        authorRepo.save(firstauthor);
        bookRepo.save(firstBook);
        publisherRepo.save(firstPublisher);


        Author secondAuthor= new Author();
        secondAuthor.setFirstName("Mr.C");
        secondAuthor.setLastName("RVe");

        Publisher secondPublisher=new Publisher();
        secondPublisher.setName("Second Publisher");
        secondPublisher.setCity("Mumbvai");
        publisherRepo.save(secondPublisher);

        Book secondBook=new Book();
        secondBook.setBookName("SecondBook");
        secondBook.setPublisher(secondPublisher);
        secondBook.setIsbn("696");
      //  secondBook.getAuthors().add(secondAuthor);
        secondAuthor.getBooks().add(secondBook);

        authorRepo.save(secondAuthor);
        bookRepo.save(secondBook);
        publisherRepo.save(secondPublisher);

        System.out.println(authorRepo.count());
       // System.out.println(bookRepo.toString());
        System.out.println(bookRepo.count());
        System.out.println(publisherRepo.count());
        System.out.println(secondAuthor.getBooks());


    }
}
