//Use Lambda Function to validate First Name, Last Name, Email, Mobile, and Password.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface userData {
    String result(String data);
}

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");

        //Checking for first name
        userData validateFirstName = (Name) -> {
            String firstNameCheck = "[A-Z][a-z]{3,}";
            Pattern pattern = Pattern.compile(firstNameCheck);
            Matcher firstName = pattern.matcher(Name);
            if (firstName.matches()) return "First name is valid";
            else return "First name is invalid";
        };
        System.out.println(validateFirstName.result("Vivek"));

        //Checking for last name
        userData validateLastName = (Name) -> {
            String lastNameCheck = "[A-Z][a-z]{3,}";
            Pattern pattern = Pattern.compile(lastNameCheck);
            Matcher lastName = pattern.matcher(Name);
            if (lastName.matches()) return "Last name is valid";
            else return "Last name is invalid";
        };
        System.out.println(validateLastName.result("Gujale"));

        //Checking for email ID name
        userData validateMailID = (MailID) -> {
            String emailIDCheck = "[abc]{3}(.?[a-z0-9]{2,})?@[bl]{2}.[a-z]{2,}(.?[a-z]{2,})?";
            Pattern pattern = Pattern.compile(emailIDCheck);
            Matcher emailID = pattern.matcher(MailID);
            if (emailID.matches()) return "Email ID is valid";
            else return "Email ID is invalid";
        };
        System.out.println(validateMailID.result("abc@bl.co.aus"));

        //Checking for mobile number
        userData validateMobileNumber = (MailID) -> {
            String mobileCheck = "[91]{2}[ ][0-9]{10}";
            Pattern pattern = Pattern.compile(mobileCheck);
            Matcher email = pattern.matcher(MailID);
            if (email.matches()) return "Mobile number is valid";
            else return "Mobile number is invalid";
        };
        System.out.println(validateMobileNumber.result("91 9898989898"));

        //Checking for password
        userData validatePassword = (Password) -> {
            String passwordCheck = "[A-Z][a-z]{4,}[0-9]{1,}[!@#^%&*]";
            Pattern pattern = Pattern.compile(passwordCheck);
            Matcher password = pattern.matcher(Password);
            if (password.matches()) return "Password is valid";
            else return "Password is invalid";
        };
        System.out.println(validatePassword.result("Vivek456*"));
    }
}