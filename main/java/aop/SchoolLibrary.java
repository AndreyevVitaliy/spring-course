package aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends Library{
    @Override
    public void getBook() {
        System.out.println("Мы берем книгу из SchoolLibrary");
    }


    protected  String returnBook() {
        System.out.println("Мы возвращаем книгу в SchoolLibrary");
        return "строка";
    }
}
