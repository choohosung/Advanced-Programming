package Week_9th;

interface IUserService {
    public void registerUser(User user);
}

class User {
    private String firstName;
    private String lastName;
    private String email;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

class UserService implements IUserService {

    public void registerUser(User user) { }

    private void sendEmail(String mailAddress, String toEmail, String subject, String body) {
        System.out.println("EMail Sent Successfully!!");
    }
}

public class Ex_1 { }
