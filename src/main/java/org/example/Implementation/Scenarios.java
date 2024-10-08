package org.example.Implementation;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.junit.Test;

public class Scenarios {
    @When("i have printed few lines {string}")
    public void i_have_printed_few_lines(String string) {
        System.out.println("Hi my first name is"+string);
        Assert.assertTrue(true);
    }

    @Then("i have printed few more lines {string}")
    public void i_have_printed_few_more_lines(String string) {
        System.out.println("Hi my last name is"+string);
        Assert.assertTrue(true);
    }


}
