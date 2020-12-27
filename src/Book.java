public class Book {
    private Status status = Status.AVAILABLE;
    private final String title;

    public Book(Status status, String title) {
        this.status = status;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}