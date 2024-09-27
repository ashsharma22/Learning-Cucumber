package search;

import car.Car;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SearchingCar {
	
	Car car;
	
	//We haven't created the object of car class. It has been created automatically by pico container
	public SearchingCar(Car car) {
		System.out.println("**********SearchingCar Constructor*************");
		this.car=car;
	}

	@ParameterType("(.+?)")
	//Method name colors should match with cucumber expression keyword
	public Color colors(String allColors) {
		System.out.println("Print all colors: "+allColors);
		Color c=new Color();
		c.name = allColors.split(",")[1];
		return c;
	}
	
	@ParameterType("(.+?)")
	//Method name colors should match with cucumber expression keyword
	public User address(String address) {
		System.out.println("Address: "+address);
		User u=new User();
		String temp[] = address.split(",");
		u.hNum = temp[0];
		u.street = temp[1];
		u.city = temp[2];
		u.country = temp[3];
		return u;
	}
	
	//set the car.name
	@Given("I go to buy car")
	public void i_go_to_buy_car() {
		System.out.println("I go to buy car");
		car.name = "Mercedes";
 	}
	
	//print car.name
	@Given("car must be of {string}")
	public void car_must_be_of(String brand) {
		System.out.println("car must be of "+brand);
		System.out.println("Car Name: "+car.name);
	}

	@And("car can be {colors} in color")
	public void car_can_be_in_color(Color c) {
		System.out.println("car can be "+c.name+" in color.");
	}
	
	@Given("my address is {address}")
	public void getAddress(User user) {
		System.out.println("Inside getAddress");	
		user.printUser();
	}

	@When("I search for car")
	public void i_search_for_car() {
		System.out.println("I search for car");
	}

	@And("I select City as Tokyo")
	public void i_select_City_as_Tokyo() {
		System.out.println("I select City as Tokyo");
	}

}
