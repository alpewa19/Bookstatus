public class FromBorrowedStatusMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        if ((book.getStatus()).equals(Status.BORROWED)) {
            switch (requestedStatus) {
                case ARCHIVED:
                    System.out.println("Переход из статуса BORROWED в статус ARCHIVED завершен.");
                    book.setStatus(Status.ARCHIVED);
                    break;
                case AVAILABLE:
                    System.out.println("Переход из статуса BORROWED в статус AVAILABLE завершен.");
                    book.setStatus(Status.AVAILABLE);
                    break;
                case OVERDUED:
                    System.out.println("Переход из статуса BORROWED в статус OVERDUED завершен.");
                    book.setStatus(Status.OVERDUED);
                    break;
                case BORROWED:
                    System.out.println("Уже в этом статусе.");
                    break;
                default:
                    System.out.println("Перевод из " + requestedStatus + " в статус BORROWED невозможен!");
            }
        } else {
            System.out.println("Error, not my status");
        }
        System.out.println("status book - " + book.getStatus());
    }
}