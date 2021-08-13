package com.userregistrationlambda;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface UserValidFunction{
    void Validator();
}

public class UserRegistrationUtilities {

    Scanner sc = new Scanner(System.in);

    public void getAnd_Validate_UserDetails()
    {
        // Using Lambda Fuction to validate user details .

        // Validating First Name .

        UserValidFunction firstName = () ->
        {
            System.out.println("Enter First Name : ");
            String name = sc.next();

            String name_regex = "^[A-Z]{1}[a-z]{2,}$";
            Pattern pattern = Pattern.compile(name_regex);

            Matcher matcher = pattern.matcher(name);
            if (matcher.matches()) {
                System.out.println("Given first name is Valid");
            }
            else
                System.out.println("Given first name is Not Valid");
        };
        firstName.Validator();

        UserValidFunction lastName = () ->
        {
            System.out.println("Enter Last Name : ");
            String name = sc.next();

            String name_regex = "^[A-Z]{1}[a-z]{2,}$";
            Pattern pattern = Pattern.compile(name_regex);

            Matcher matcher = pattern.matcher(name);
            if (matcher.matches()) {
                System.out.println("Given Last name is Valid");
            }
            else
                System.out.println("Given Last name is Not Valid");
        };
        lastName.Validator();

        UserValidFunction email = () ->
        {
            System.out.println("Enter Email : ");
            String name = sc.next();

            String mail_regex = "^[0-9A-Za-z]+(([._+-]{0,1})[0-9A-Za-z]+)*@[0-9A-Za-z]+.[a-z]{2,4}.([a-z]{2,3})*$";
            Pattern pattern = Pattern.compile(mail_regex);

            Matcher matcher = pattern.matcher(name);
            if (matcher.matches()) {
                System.out.println("Given Email is Valid");
            }
            else
                System.out.println("Given Email is Not Valid");
        };
        email.Validator();

        UserValidFunction phoneNumber = () ->
        {
            System.out.println("Enter Phone Number : ");
            String name = sc.next();

            String phoneNumber_regex = "^(91)[0-9]{10}$";
            Pattern pattern = Pattern.compile(phoneNumber_regex);

            Matcher matcher = pattern.matcher(name);
            if (matcher.matches()) {
                System.out.println("Given Phone Number is Valid");
            }
            else
                System.out.println("Given Phone Number is Not Valid");
        };
        phoneNumber.Validator();

        UserValidFunction password = () ->
        {
            System.out.println("Enter Password : ");
            String name = sc.next();

            String password_regex = "^(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$)(?=.*[a-z])(?=.*[A-Z]).{8,}$";
            Pattern pattern = Pattern.compile(password_regex);

            Matcher matcher = pattern.matcher(name);
            if (matcher.matches()) {
                System.out.println("Given Password is Valid");
            }
            else
                System.out.println("Given Password is Not Valid");
        };
        password.Validator();
    }
}
