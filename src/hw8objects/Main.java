package hw8objects;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("John", "Tolkien");
        Author author1 = new Author("lev", "Tolstoy");

        Book book = new Book("Lord  of the Rings", author, 1954);
        Book book1 = new Book("War and Peace", author1, 1899);

        book.setPublishingYear(1955);
        System.out.println((author.getAuthorName() + " " + author.getAuthorSurname()));
        System.out.println((book.getBookName() + " " + book.getPublishingYear()));

        System.out.println((author1.getAuthorName() + " " + author1.getAuthorSurname()));
        System.out.println((book1.getBookName() + " " + book1.getPublishingYear()));


    }
}
