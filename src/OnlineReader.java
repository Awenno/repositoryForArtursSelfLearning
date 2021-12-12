public class OnlineReader {

    public static void main(String[] args) {

        Book warAndPeace = new Book("Война и мир", "Лев Николаевич Толстой ", "роман",
                4, 1300, 10, 5.0);
        Book javaCompleteGuide = new Book("Java.Полное руководство ", "Герберт Шилдт ", "наука",
                1488, 9, 4.9);
        Book harryPotter = new Book("Гарри Поттер", "Джоан Кэтлин Роулинг", "фантастика",
                7, 460, 8, 3.6);
        Book theWitcher = new Book("Ведьмак", "Анджей Сапковский", "фэнтези",
                8, 640, 11, 4.8);
        Book.bookMenu();
        System.out.print(warAndPeace + "\n\n" + javaCompleteGuide + "\n\n" + harryPotter + "\n\n" + theWitcher + "\n");
        //Book.recommendation(Book.bestRating, Book.author,Book.);
    }
}
