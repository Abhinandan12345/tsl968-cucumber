package stepdefination;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddSteps {
	int a,b,sum;
	@Given("I have two Number as {string} & {string}")
	public void i_have_two_number_as(String num1, String num2) {
		a=Integer.parseInt(num1);
		b=Integer.parseInt(num2);
	}
	@Given("I have two Number as List")
	public void i_have_two_number_as_list(List<String> numbers) {
		a=Integer.parseInt(numbers.get(0));
		b=Integer.parseInt(numbers.get(1));
	
	}



	@When("I do Addition")
	public void i_do_addition() {
	    sum=a+b;
	}
	@Then("Result should display in Console")
	public void result_should_display_in_console() {
		 System.out.println("the sum is "+sum);	}
	
	
	//@Given("I have two Number as {string} & {string}")
	//public void i_have_two_number_list(List<String> numbers) {
	 //  a=Integer.parseInt(numbers.get(0));
	  // b=Integer.parseInt(numbers.get(1));
	//}
	@Given("I have two Number as Map")
	public void i_have_two_number_as_map(io.cucumber.datatable.DataTable dataTable) {
     Map<String,String> data= dataTable.asMap(String.class, String.class);
     a=Integer.parseInt(data.get("num1"));
     b=Integer.parseInt(data.get("num2"));
	}}

