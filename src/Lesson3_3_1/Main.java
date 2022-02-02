package Lesson3_3_1;

import Lesson3_3_1.library.Librarian;

public class Main {
    public static void main(String[] args) {
        AdministratorLibrarian administrator = new AdministratorLibrarian("Татьяна");
        ReaderImpl reader = new ReaderImpl("Игорь");
        SupplierImpl supplier = new SupplierImpl("Виталик");
        Librarian librarian = administrator;

        administrator.findBook(administrator,supplier);
        administrator.orderBook(librarian,supplier);
        reader.getBook(administrator, reader);
        administrator.notifyReader(administrator, reader);
        supplier.suppliesBook(supplier,administrator);
        librarian.orderBook(librarian,supplier);
        reader.returnBook(administrator,reader);
        administrator.returnBook(administrator,reader);


    }
}
