package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day6_TestNG_Assertions {

    @Test
    public void equalsAssertionTest() {

        String actualTitle = "Products";
        String expectedTitle = "Products";

        Assert.assertEquals(actualTitle, expectedTitle);

        System.out.println("Title verification completed.");
    }

    @Test
    public void trueAssertionTest() {

        boolean loginSuccessful = true;

        Assert.assertTrue(loginSuccessful);

        System.out.println("Login verification completed.");
    }
}