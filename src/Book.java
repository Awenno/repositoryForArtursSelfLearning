// количество страниц
// размер шрифта
// обложка
// авторы
// жанр

import java.util.Arrays;

public class Book {
    String bookName;   // название книги
    String author;     // автор
    String genre;      // жанр
    int numberVolumes; // количество томов
    int numberPages;   // количество страниц
    int fontSize;      // размер шрифта
    double rating;     // рейтинг среди читателей
    static double bestRating;

    public Book(String bookName, String author, String genre, int numberVolumes, int numberPages, int fontSize,
                double rating) {
        this.bookName = bookName;
        this.author = author;
        this.genre = genre;
        this.numberVolumes = numberVolumes;
        this.numberPages = numberPages;
        this.fontSize = fontSize;
        this.rating = rating;
        bestRating = Math.max(bestRating, rating);
    }

    public Book(String bookName, String author, String genre, int numberPages, int fontSize, double rating) {
        this.bookName = bookName;
        this.author = author;
        this.genre = genre;
        this.numberVolumes = 1;
        this.numberPages = numberPages;
        this.fontSize = fontSize;
        this.rating = rating;
        bestRating = Math.max(bestRating, rating);
    }

    public String toString() {
        return bookName + "\nавтор: " + author + "\nжанр: " + genre + "\nколичество томов: "
                + numberVolumes + "\nколичество страниц: " + numberPages + "\nразмер шрифта: " + fontSize
                + "\nрейтинг среди читателей: " + rating;
    }

    public static void bookMenu() {
        System.out.println("У нас есть несколько интересных книг на выбор: " + "\n");
    }

    public static double recommendation(double bestRating, String author, String bookName) {
        System.out.println("\nМы рекомендуем Вам книгу " + bookName + "\nавтор: " + author +
                "\nпотому что у нее самый высокий рейтинг среди читателей: " + bestRating);
        return bestRating;
    }
}
