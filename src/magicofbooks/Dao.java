package magicofbooks;

import magicofbooks.helper.UtilityClass;
import magicofbooks.pojo.Book;
import magicofbooks.pojo.User;

// Data Access Object Class for performing all the functions that user want
public class Dao {

    // This Method basically get the Authorized user as Parameter and Print all the book of that particular User (New books, Favourite Books, Completed Books)
    public void showAllBooksOfUser(User user) {
        for (String string : user.getUserBookInfo().keySet()) {
            System.out.print(string + " : ");
            for (Book book : user.getUserBookInfo().get(string)) {
                System.out.print(book.getBookName() + " ");
            }
            System.out.println();
        }
    }

    // This Method basically check the book availability using book Id and print it whether it is Available or not
    public void showBookAvailability() {
        System.out.println("Enter the Book Id");
        boolean flag = false;
        int bookId = UtilityClass.sc.nextInt();//Integer.parseInt(UtilityClass.sc.next());
        UtilityClass.sc.nextLine();
        if (bookId < 1) {
            throw new NegativeValueException("Negative values are not allowed");
        }
        for (Book book : UtilityClass.bookList) {
            if (book.getBookId() == bookId) {
                System.out.println("Available");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Unavailable");
        }
    }

    // This method basically print the book details like (Author Name, Description of the Book)
    public void showDetailsOfBook() {
        boolean flag = false;
        System.out.println("enter the book name");
        String bookName = UtilityClass.sc.nextLine();
        for (Book book : UtilityClass.bookList) {
            if (book.getBookName().toLowerCase().equals(bookName.toLowerCase())) {
                System.out.println("Author Name: " + book.getAuthorName());
                System.out.println("Description : " + book.getDescription());
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("This book detail is not exist");
        }
    }
}
