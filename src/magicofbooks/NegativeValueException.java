package magicofbooks;

// This is a Custom User Exception class for creating the custom exception
public class NegativeValueException extends RuntimeException {

    // Default Constructor
    public NegativeValueException() {

    }

    // Parameterized Constructor
    public NegativeValueException(String msg) {
        super(msg);
    }


}
