package magicofbooks.pojo;

import java.util.*;

// This is a simple pojo User Class
public class User {
    private String userName;
    private int userId;
    private String emailId;
    private String password;
    public Map<String, List<Book>> userBookInfo;

    // Default Constructor
    public User() {

    }

    // Parameterized Constructor
    public User(String userName, int userId, String emailId, String password, Map<String, List<Book>> userBookInfo) {
        this.userName = userName;
        this.userId = userId;
        this.emailId = emailId;
        this.password = password;
        this.userBookInfo = userBookInfo;
    }

    // Below are all the getter and setter method for getting and setting the values
    public Map<String, List<Book>> getUserBookInfo() {
        return userBookInfo;
    }

    public void setUserBookInfo(Map<String, List<Book>> userBookInfo) {
        this.userBookInfo = userBookInfo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
