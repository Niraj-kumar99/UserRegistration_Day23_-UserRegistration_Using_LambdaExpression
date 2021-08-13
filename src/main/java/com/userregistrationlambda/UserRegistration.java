package com.userregistrationlambda;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean validName(String name) {
        if (name.isEmpty())
            System.out.println("First Name is empty .");

        String name_regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(name_regex);
        Matcher matcher = pattern.matcher(name);
        boolean isMatch = matcher.matches();

        return (isMatch);
    }

    public boolean validEmail(String mail)
    {
        if (mail.isEmpty())
            System.out.println("First Name is empty .");

        String mail_regex = "^[0-9A-Za-z]+(([._+-]{0,1})[0-9A-Za-z]+)*@[0-9A-Za-z]+.[a-z]{2,4}.([a-z]{2,3})*$";
        Pattern pattern = Pattern.compile(mail_regex);
        Matcher matcher = pattern.matcher(mail);
        boolean isMatch = matcher.matches();

        return (isMatch);
    }

    public boolean validMobileNumber(String mob_number)
    {
        if (mob_number.isEmpty())
            System.out.println("First Name is empty .");

        String mobileNumber_regex = "^[0-9]{10}$";
        Pattern pattern = Pattern.compile(mobileNumber_regex);
        Matcher matcher = pattern.matcher(mob_number);
        boolean isMatch = matcher.matches();

        return (isMatch);
    }

    public boolean validPassword(String password)
    {
        if (password.isEmpty())
            System.out.println("First Name is empty .");

        String password_regex = "^(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$)(?=.*[a-z])(?=.*[A-Z]).{8,}$";
        Pattern pattern = Pattern.compile(password_regex);
        Matcher matcher = pattern.matcher(password);
        boolean isMatch = matcher.matches();

        return (isMatch);
    }
}
