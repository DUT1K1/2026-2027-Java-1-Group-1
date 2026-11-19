public class Book {
    String title;
    int pages;

    void addPages(int extraPages) {
        pages += extraPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                '}';
    }
}
