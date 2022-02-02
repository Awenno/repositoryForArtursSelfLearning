package Lesson3_3_1;

import Lesson3_3_1.library.*;

public class AdministratorLibrarian extends Users implements Administrator, Librarian, Reader {

    public AdministratorLibrarian(String name) {
        super(name);
    }

    @Override
    public void findBook(Administrator administrator, Supplier supplier) {
        System.out.println("Администратор " + administrator + " заказал у поставщика "
                + supplier + " несколько новых книг.");
    }

    @Override
    public void notifyReader(Administrator administrator, Reader reader) {
        System.out.println("Администратор " + administrator + " уведомил " + reader
                + " о проссрочке ");
    }


    @Override
    public void orderBook(Librarian librarian, Supplier supplier) {
        System.out.println("Администратор " + librarian + " заказывает книги у " + supplier);
    }


    @Override
    public void getBook(Administrator administrator, Reader reader) {
        System.out.println("Администратор " + administrator + " выдала книгу " + reader);
    }

    @Override
    public void returnBook(Administrator administrator, Reader reader) {
        System.out.println(administrator + " принимает книгу, которую вернул их читатель " + reader);

    }
}
