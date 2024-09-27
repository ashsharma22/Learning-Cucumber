package buy.computer;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Computer {
	
	//Cucumber hooks @Before and @After
	@Before
	public void init(Scenario s) {
		System.out.println("------------Init--------------"+s.getName());
	}
	
	@After
	public void quit(Scenario s) {
		System.out.println("------------Quit--------------"+s.getStatus());
		System.out.println();
	}

    @Given("I want to buy a PC")
    public void buy_pc() {
     	System.out.println("I want to buy a PC");
    }
    
    @And("^PC should be of (.*)$")
    public void pc_company(String company){
    	System.out.println("PC Should be of: "+company);      	
    }
    
    @And("^it should be a (.*)$")
    public void s(String type) {
    	System.out.println("It should be a: "+type);
    }
    
    @And("I select {string} as {int} inch")
    public void i_select_as_inch (String screenType, int inch) {
    	System.out.println("I select "+screenType+" as "+inch+" inch");
    }
    
    @And("a {string} finish")
    public void finish(String finish) {
    	System.out.println("a "+finish);
    }
    
    @And("I select harddrive {int} TB")
    public void harddrive(int capacity) {
    	System.out.println("I select harddrive as: "+capacity);
    }
    
    @And("^I get (.*) (\\d+) results$")
    public void getresults(String range, int count) {
    	System.out.println("I get "+range+" "+count+" results");
    }
    
    //Alternative of above method. Above is more effective method than this method. Getting error with below method
	/*
	 * @And("^I get (atleast | atmost | a top discuount bar with) (\\d+) results$")
	 * public void getresults(String range, int count) {
	 * System.out.println("I get "+range+" "+count+" results"); }
	 */
    
    @And("RAM {int} GB")
    public void ram(int ram) {
    	System.out.println("RAM: "+ram);
    }
    
    @Then("price should be less than {int}")
    public void price_should_be_less_than(int price) {
    	System.out.println("price should be less than "+price);
    }
    
    @And("it should come with a bag")
    public void bag() {
    	System.out.println("it should come with a bag");
    }
    		
}
