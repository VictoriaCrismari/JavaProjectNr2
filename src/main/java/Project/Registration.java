package Project;

public class Registration {
    //Create Registration Class in which you would have variables such as email,
    //userName and password that have an access scope only within its own class.
    //After creating an object of the class, the user should be able to call methods
    //and in each method separately pass values to set users email, username and
    //password.
    //Requirements:
    //● Valid email consider to be only yahoo
    //● Valid userName and password cannot be empty and should be of
    //length larger than 6 characters. Also valid passwords cannot contain
    //userName.
    private String email, username, password;

    public Registration(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }

    String setUserEmail() {
        if (email.endsWith("@yahoo.com")) {
            System.out.println("Email is accepted ");
        } else {
            System.out.println("Invalid email, use yahoo email");
        }
        return email;
    }

    String setUserName() {
        if (username.length() > 6) {
            System.out.println("Username accepted");
        } else System.out.println("Invalid username, please make sure that user name is larger than 6 char");
        return username;
    }

    String setPassword() {
        if (password.length() > 6 && !(password.contains(username))) {
            System.out.println("Password is accepted");
        } else {
            System.out.println("Password is invalid, please make sure password is larger" +
                    " than 6 char and does not contain username");
        }
        return password;}
        public void userInfo(){
            System.out.println("New user info: "+email+" // "+username+" // "+password);
        }

    }
class RegistrationTester{
    public static void main(String[] args) {
        Registration R=new Registration("SyntaxTech@yahoo.com","SyntaxTech","Pass123456");
        R.setPassword();
        R.setUserEmail();
        R.setUserName();
        R.userInfo();
    }
}

