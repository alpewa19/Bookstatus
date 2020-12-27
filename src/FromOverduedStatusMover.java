public class FromOverduedStatusMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        if ((book.getStatus()).equals(Status.OVERDUED)) {
            switch (requestedStatus) {
                case ARCHIVED:
                    System.out.println("Переход из статуса OVERDUED в статус ARCHIVED завершен.");
                    book.setStatus(Status.ARCHIVED);
                    break;
                case AVAILABLE:
                    System.out.println("Переход из статуса OVERDUED в статус AVAILABLE завершен.");
                    book.setStatus(Status.AVAILABLE);
                    break;
                case OVERDUED:
                    System.out.println("Уже в этом статусе.");
                    break;
                default:
                    System.out.println("Перевод книги из статуса OVERDUED в статус BORROWED невозможен!");
            }
        } else {
            System.out.println("Error, not my status");
        }
        System.out.println("status book - " + book.getStatus());
    }
}