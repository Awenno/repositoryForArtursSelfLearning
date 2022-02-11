package Lesson3_3_1;

import Lesson3_3_1.library.Librarian;

public class Main {
    public static void main(String[] args) {
        AdministratorLibrarian administrator = new AdministratorLibrarian("Татьяна");
        ReaderImpl reader = new ReaderImpl("Игорь");
        SupplierImpl supplier = new SupplierImpl("Виталик");
        Librarian librarian = administrator;

        administrator.findBook(supplier);
        administrator.orderBook(supplier);
        reader.getBook(administrator);
        administrator.notifyReader(reader);
        supplier.suppliesBook(administrator);
        librarian.orderBook(supplier);
        reader.returnBook(administrator);
        administrator.returnBook(reader);

    }
}
