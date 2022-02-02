package Lesson3_3_1.library;

public interface Reader {

    void getBook(Administrator administrator, Reader reader);
    void returnBook(Administrator administrator, Reader reader);
}
