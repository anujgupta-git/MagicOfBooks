package magicofbooks.helper;

import magicofbooks.pojo.Book;
import magicofbooks.pojo.User;

import java.util.*;

// Creating Utility Class for Containing all the Users and their books details
public class UtilityClass {

    // Creating the Scanner class object for getting value from the user we can use this Scanner class object anywhere
    public static final Scanner sc = new Scanner(System.in);

    // Creating the List for storing the Books
    // It Contains some Default books
    public static final List<Book> bookList = Arrays.asList(
            new Book(1, "Ulysses", "James Joyce", "Ulysses by James Joyce"),
            new Book(2, "Don Quixote", "Miguel de Cervantes", " Don Quixote by Miguel de Cervantes"),
            new Book(3, "One Hundred Years of Solitude", "Gabriel Garcia Marquez", "One Hundred Years of Solitude by Gabriel Garcia Marquez"),
            new Book(4, "Hamlet", "William Shakespeare", "Hamlet by William Shakespeare"),
            new Book(5, "In Search of Lost Time", "Marcel Proust", " In Search of Lost Time by Marcel Proust")
    );

    // Creating HashMap for storing each user Books Info
    private static final Map<String, List<Book>> firstUserBookInfo = getBook(Arrays.asList(0), Arrays.asList(1, 2), Arrays.asList(3));
    private static final Map<String, List<Book>> secondUserBookInfo = getBook(Arrays.asList(2), Arrays.asList(0, 3), Arrays.asList(4));
    private static final Map<String, List<Book>> thirdUserBookInfo = getBook(Arrays.asList(1), Arrays.asList(2), Arrays.asList(3, 4));
    private static final Map<String, List<Book>> forthUserBookInfo = getBook(Arrays.asList(4), Arrays.asList(1), Arrays.asList(1, 3));
    private static final Map<String, List<Book>> fifthUserBookInfo = getBook(Arrays.asList(4), Arrays.asList(0), Arrays.asList(3));

    // Created the getBook Method that takes list of newBooksIndex , favouriteBookIndex, completedBookIndex and return the Map which contain
    // key -> (new, favourite, completed) and values -> (list of newBooksObject, list of favouriteBooksObject, List of completedBooksObjects)
    private static final Map<String, List<Book>> getBook(List<Integer> newBooksIndex, List<Integer> favouriteBooksIndex, List<Integer> completedBooksIndex) {
        Map<String, List<Book>> books = new HashMap<>();

        // Creating List for storing newBooks Object
        List<Book> newBooks = new ArrayList<>();

        for (int index : newBooksIndex) {
            newBooks.add(bookList.get(index));
        }
        books.put("new", newBooks);

        // Creating List for storing favourite books objects
        List<Book> favouriteBooks = new ArrayList<>();

        for (int index : favouriteBooksIndex) {
            favouriteBooks.add(bookList.get(index));
        }
        books.put("favourite", favouriteBooks);

        // Creating List for storing Completed Books Objects
        List<Book> completedBooks = new ArrayList<>();
        for (int index : completedBooksIndex) {
            completedBooks.add(bookList.get(index));
        }
        books.put("completed", completedBooks);
        return books;
    }

    // Creating the List for storing Users
    public static final List<User> userList = Arrays.asList(
            new User("Adam Sandler", 1, "adamsandler@gmail.com", "adamsandler123", firstUserBookInfo),
            new User("Tom Hanks", 2, "tomHanks@gmail.com", "tomHanks123", secondUserBookInfo),
            new User("Tom Cruise", 3, "tomCruise@gmail.com", "tomCruise123", thirdUserBookInfo),
            new User("Angelina Jolie", 4, "angelinaJolie@gmail.com", "angelinaJolie123", forthUserBookInfo),
            new User("Scarlett Johansson", 5, "scarlettJohansson@gmail.com", "scarlettJohansson123", fifthUserBookInfo)
    );


}
