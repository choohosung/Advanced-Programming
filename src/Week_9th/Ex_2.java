package Week_9th;

class NUserService implements IUserService {

    private EmailInfo emailInfo;
    private IEmailService emailService;
    public void registerUser(User user) {  }
}

class EmailInfo {
    private String subject;
    private String body;
    private String email;
    public EmailInfo(String subject, String body, String email) {
        super();
        this.subject = subject;
        this.body = body;
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

interface IEmailService {
    void sendEmail(EmailInfo emailInfo);
}

class EmailService implements IEmailService {
    public void sendEmail(EmailInfo emailInfo) {
    	System.out.println("EMail Sent Successfully!!");
    }
}

public class Ex_2 { }
