package cnn;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CNN {

	@Given("I open {string}")
	public void openBrowser(String browser) {
		System.out.println("I open "+browser);
	}
	
    @And("go to {string}")
    public void navigate(String url) {
    	System.out.println("go to "+ url);
    }
    
    //Not using this
    @Then("top menu should have the links {string}")
    public void topMenu(String links) {
    	System.out.println("top menu should have the links "+links);
    }
    
    //Commenting this method to get the better version of this.
	/*
	 * @Then("top menu should have links") public void
	 * top_menu_should_have_links(DataTable dataTable) {
	 * System.out.println("Top menu should have links: "+dataTable.toString());
	 * System.out.println();
	 * System.out.println("Top menu should have links (without toString): "
	 * +dataTable); System.out.println("**************************************");
	 * System.out.println("Top menu should have links (asMap): "+dataTable.asMaps())
	 * ; System.out.println("**************************************");
	 * List<Map<String, String>> data=dataTable.asMaps();
	 * 
	 * System.out.println("Map 1 - Print");
	 * System.out.println("Link1: "+data.get(0).get("Links"));
	 * System.out.println("Title1: "+data.get(0).get("Title"));
	 * System.out.println("**************************************");
	 * 
	 * System.out.println("Map 2 - Print");
	 * System.out.println("Link1: "+data.get(1).get("Links"));
	 * System.out.println("Title1: "+data.get(1).get("Title")); }
	 */
    
    //This table will read all the values of the data table using map, and keep inside toplinks class
    int i=0;
    @DataTableType
    public TopLinks entry(Map<String, String> entry) {
    	System.out.println("Inside DataTable: "+(i++));
    	return new TopLinks(entry.get("Links"), entry.get("Title"));
    }
    
    @Then("top menu should have links")
    public void top_menu_should_have_links(List<TopLinks> topLinks) {
    	System.out.println("Top menu should have links: ");
    	System.out.println("Link1: "+topLinks.get(0).links);
    	System.out.println("Link2: "+topLinks.get(1).links);
    	System.out.println("*******************************************");
      
    }
}
