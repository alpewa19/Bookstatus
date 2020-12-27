public class FromAvailableStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if ((book.getStatus()).equals(Status.AVAILABLE)) {
            switch (requestedStatus) {
                case ARCHIVED:
                    System.out.println("Переход из статуса AVAILABLE в статус ARCHIVED завершен.");
                    book.setStatus(Status.ARCHIVED);
                    break;
                case BORROWED:
                    System.out.println("Переход из статуса AVAILABLE в статус BORROWED завершен.");
                    book.setStatus(Status.BORROWED);
                    break;
                case AVAILABLE:
                    System.out.println("Уже в этом статусе.");
                    break;
                default:
                    System.out.println("Перевод книги из статуса AVAILABLE в статус OVERDUED невозможен!");
            }
        } else {
            System.out.println("Error, not my status");
        }
        System.out.println("status book - " + book.getStatus());
    }
}