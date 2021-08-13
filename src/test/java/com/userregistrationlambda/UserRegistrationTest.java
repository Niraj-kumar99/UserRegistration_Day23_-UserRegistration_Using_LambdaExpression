package com.userregistrationlambda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    UserRegistration validate = new UserRegistration();

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        Assertions.assertTrue(validate.validName("Niraj"));
    }

    @Test
    public void givenFirstName_WhenStartingNotCapital_ShouldReturnFalse() {
        Assertions.assertFalse(validate.validName("niraj"));
    }

    @Test
    void givenFirstName_WhenShort_ShouldReturnFalse() {
        Assertions.assertFalse(validate.validName("Ni"));
    }

    @Test
    public void givenFirstName_WithNumberOrSpecialChar_ShouldReturnFalse() {
        Assertions.assertFalse(validate.validName("Nir@j"));
    }

    @Test
    public void givenMail_WhenValid_ShouldReturnTrue() {
        Assertions.assertTrue(validate.validEmail("nkj@gmail.com"));
    }

    @Test
    public void givenMail_WithoutAtTheRate_ShouldReturnFalse() {
        Assertions.assertFalse(validate.validEmail("nkj.com"));
    }

    @Test
    public void givenMail_WithoutUserName_ShouldReturnFalse() {
        Assertions.assertFalse(validate.validEmail("@gmail.com"));
    }

    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
        Assertions.assertTrue(validate.validMobileNumber("4875976234"));
    }

    @Test
    public void givenMobileNumber_WhenShort_ShouldReturnFalse() {
        Assertions.assertFalse(validate.validMobileNumber("49897890"));
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        Assertions.assertTrue(validate.validPassword("Pass@word45"));
    }

    @Test
    public void givenPassword_WhenShort_ShouldReturnFalse() {
        Assertions.assertFalse(validate.validPassword("Pas33#"));
    }

    @Test
    public void givenPassword_WhenNoUpperCase_ShouldReturnFalse() {
        Assertions.assertFalse(validate.validPassword("pass$56word"));
    }
}
