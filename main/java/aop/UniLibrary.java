package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends Library {

    public void getBook(Book book) {
        System.out.println("Мы берем книгу из UniLibrary: " + book.getName());
    }

    public void returnBook() {
        System.out.println("Мы возвращаем книгу в UniLibrary");
    }
}
