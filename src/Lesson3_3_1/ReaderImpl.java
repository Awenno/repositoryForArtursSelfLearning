package Lesson3_3_1;

import Lesson3_3_1.library.*;

public class ReaderImpl extends Users implements Reader {

    public ReaderImpl(String name) {
        super(name);
    }

    @Override
    public void getBook(Administrator administrator, Reader reader) {
        System.out.println(reader + " взял несколько книг у администратора " + administrator);
    }

    @Override
    public void returnBook(Administrator administrator, Reader reader) {
        System.out.println(reader + " вернул прочитанную книгу администратору " + administrator);
    }
}
