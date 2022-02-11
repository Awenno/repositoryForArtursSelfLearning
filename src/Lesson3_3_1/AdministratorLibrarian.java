package Lesson3_3_1;

import Lesson3_3_1.library.*;

public class AdministratorLibrarian extends Users implements Administrator, Librarian, Reader {

    public AdministratorLibrarian(String name) {
        super(name);
    }

    @Override
    public void findBook(Supplier supplier) {
        System.out.println("Администратор " + getName() + " заказал у поставщика "
                + supplier + " несколько новых книг.");
    }

    @Override
    public void notifyReader(Reader reader) {
        System.out.println("Администратор " + getName() + " уведомил " + reader
                + " о проссрочке ");
    }


    @Override
    public void orderBook(Supplier supplier) {
        System.out.println("Администратор " + getName() + " заказывает книги у " + supplier);
    }

    @Override
    public void getBook(Reader reader) {
        System.out.println("Администратор " + getName() + " выдала книгу " + reader);
    }

    @Override
    public void returnBook(Reader reader) {
        System.out.println(getName() + " принимает книгу, которую вернул их читатель " + reader);

    }
}
