public class Test {
    public static void main(String[] args) {
        Book book = new Book(Status.AVAILABLE, "Harry Potter");
        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        BookMover fromBorrowedStatusMover = new FromBorrowedStatusMover();
        BookMover fromOverduedStatusMover = new FromOverduedStatusMover();
        BookMover fromArchivedStatusMover = new FromArchivedStatusMover();

        fromAvailableStatusMover.moveToStatus(book, Status.BORROWED);
        System.out.println("Статус книги: " + book.getStatus() + ", название книги: " + book.getTitle());

        fromArchivedStatusMover.moveToStatus(book, Status.OVERDUED);
        System.out.println("Статус книги: " + book.getStatus() + ", название книги: " + book.getTitle());

        fromBorrowedStatusMover.moveToStatus(book, Status.ARCHIVED);
        System.out.println("Статус книги: " + book.getStatus() + ", название книги: " + book.getTitle());

        fromOverduedStatusMover.moveToStatus(book, Status.AVAILABLE);
        System.out.println("Статус книги: " + book.getStatus() + ", название книги: " + book.getTitle());
    }
}