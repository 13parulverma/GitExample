package org.amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsDef {
	int[] noOfInputs= {10,20};
	@Given("I have {int} numbers")
	public void i_have_numbers(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals((int)int1, (int)noOfInputs.length);
	    throw new cucumber.api.PendingException();
	}

	@When("I add {int} numbers")
	public void i_add_numbers(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("the result should be sum of {int} numbers")
	public void the_result_should_be_sum_of_numbers(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}
