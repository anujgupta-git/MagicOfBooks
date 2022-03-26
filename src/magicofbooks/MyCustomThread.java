package magicofbooks;

import magicofbooks.helper.UtilityClass;
import magicofbooks.pojo.User;

import static java.lang.System.exit;

// creating new Thread class by implements the Runnable Interface
public class MyCustomThread implements Runnable {
    @Override
    public void run() {

        // Created this option String variable for storing the user input whether they want to continue use this application or not
        String option;
        do {

            // Asking user for Getting the name of User
            System.out.println("Please Enter Your Username: ");

            // Getting the userName
            String userName = UtilityClass.sc.nextLine();
            boolean verification = false;
            User user1 = new User();

            // Written the verification logic here for Verify the user
            // Basically this take each user from the userList that we have created in the Utility class and
            // compare the name with the new user is it matches do verification true otherwise print on the screen not a valid user
            for (User user : UtilityClass.userList) {
                if (user.getUserName().toLowerCase().equals(userName.toLowerCase())) {
                    verification = true;
                    user1 = user;
                    break;
                }
            }

            // User Verification done successfully then show the menu to this user
            if (verification) {

                // Creating the Object of the Dao class for providing user functionality that they want to perform
                Dao dao = new Dao();

                // Showing the menu to the user
                System.out.println("Welcome " + userName + "!");
                System.out.println("**********MENU**********");
                System.out.println(
                        "1.Print your books (new,favourite,completed) \n2.Find book by bookId\n3.Print the details of a book\n4. For exit  \nplease enter your choice:");

                // Getting the choice of the user what they want to perform
                int choice = UtilityClass.sc.nextInt();
                UtilityClass.sc.nextLine();

                // If user Enter negative value as an input then user will get this custom Exception
                if (choice < 1) {
                    throw new NegativeValueException("Negative values are not allowed");
                }


                switch (choice) {
                    case 1: {

                        // Show all the books of the particular user like (newBook, completedBook, favouriteBook)
                        // Calling the showAllBooksOfUser Method that present in Dao Class
                        dao.showAllBooksOfUser(user1);
                        break;
                    }
                    case 2: {

                        // Show Book Availability whether particular book is available or not
                        // Calling the showBookAvailability Method that are present in Dao Class which contain all functionality for Book Availability check
                        dao.showBookAvailability();
                        break;
                    }
                    case 3: {

                        // Show Book details like (Author Name , Description of the Book)
                        // Calling showDetailsOfBook method that are present in Dao class which contain all funtionality for showing book details
                        dao.showDetailsOfBook();
                        break;
                    }
                    case 4: {

                        // User Exit Application
                        System.out.println("Thanks " + userName.toUpperCase() + " for using this application Hope you enjoy the service");
                        exit(0);
                    }
                    default:
                        System.err.println("Sorry! you have enter the wrong choice");
                        exit(0);
                }
            }

            // If User Authentication Fail User will get this error message
            else {
                System.err.println("Sorry! You are not an authorized user");
                exit(0);
            }
            System.out.println("Do you want to continue press y");
            option = UtilityClass.sc.nextLine();
        } while (option.toLowerCase().equals("y"));
    }
}
