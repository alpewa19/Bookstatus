public class FromArchivedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if ((book.getStatus()).equals(Status.ARCHIVED)) {
            switch (requestedStatus) {
                case AVAILABLE:
                    System.out.println("Переход из статуса ARCHIVED в статус AVAILABLE завершен.");
                    book.setStatus(Status.AVAILABLE);
                    break;
                case ARCHIVED:
                    System.out.println("Уже в этом статусе.");
                    break;
                default:
                    System.out.println("Перевод книги из статуса ARCHIVED в статус BORROWED, OVERDUED невозможен!");
            }
        } else {
            System.out.println("Error, not my status");
        }
        System.out.println("status book - " + book.getStatus());
    }
}