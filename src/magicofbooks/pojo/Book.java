package magicofbooks.pojo;

//This is a simple pojo Book Class
public class Book {
    private int bookId;
    private String bookName;
    private String authorName;
    private String description;

    // Default Constructor
    public Book() {

    }

    // Parameterized Constructor
    public Book(int bookId, String bookName, String authorName, String description) {
        this.bookId = bookId;
        this.authorName = authorName;
        this.bookName = bookName;
        this.description = description;
    }

    // Below are all getter and setter method for getting the value and setting the value
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
}
