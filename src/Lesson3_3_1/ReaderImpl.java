package Lesson3_3_1;

import Lesson3_3_1.library.*;

public class ReaderImpl extends Users implements Reader {
    public ReaderImpl(String name) {
        super(name);
    }

    @Override
    public void getBook(Reader reader) {
        System.out.println(reader + " взял несколько книг у администратора " + getName());
    }

    @Override
    public void returnBook(Reader reader) {
        System.out.println(reader + " вернул прочитанную книгу администратору " + getName() );
    }
}
