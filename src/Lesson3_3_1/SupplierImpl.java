package Lesson3_3_1;
import Lesson3_3_1.library.*;

public class SupplierImpl extends Users implements Supplier {

    public SupplierImpl(String name) {
        super(name);
    }

    @Override
    public void suppliesBook(Administrator administrator) {
        System.out.println(getName() + " поставляет книги в библиотеку по заказу библиотекаря " + administrator);
    }
}
