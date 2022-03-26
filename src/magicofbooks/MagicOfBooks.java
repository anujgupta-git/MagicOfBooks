package magicofbooks;

// This is the main Driver Class of the project
public class MagicOfBooks {
    public static void main(String[] args) {

        // Here creating the new separate thread for multithreading purpose by creating the object of the MyCustomThread class
        Thread newThread = new Thread(new MyCustomThread());

        // here starting the new thread for run the thread
        newThread.start();
    }
}

// *********** Please Read This Folder structure and Details about each class and Package before use the application *************
/*
 *  Folder Structure
 *  src
 *     magicofbooks (package)
 *          1.helper (package)
 *               1.1 Utility (Class)  ---> This Class Contains all the predefined User and Books Information it is supportive Class
 *          2. pojo (package)
 *               2.1 User (POJO Class) ---> This is a simple User POJO class
 *               2.2 Book (POJO Class) ---> This is a simple Book POJO Class
 *          3. Dao (Class)             ---> This is a Data Access object class which contain all the Methods which contain implementation of all user task that are shown in the MENU
 *          4. MagicOfBooks (Main Driver Class) ---> This is a Main Class of the Project
 *          5. MyCustomThread (Thread Class)    ---> This is a Thread Class for implementing multithreading
 *          6. NegativeValueException (Custom Exception Class) ---> This is a Custom Exception class
 */



