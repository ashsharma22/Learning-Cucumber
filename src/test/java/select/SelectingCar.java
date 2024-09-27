package select;

import car.Car;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectingCar {
	
	Car car;
	
	//We haven't created the object of car class. It has been created automatically by pico container
	public SelectingCar(Car car) {
		System.out.println("**********SelectingCar Constructor*************");
		this.car=car;
	}

	//print car names, will get the same value as set in SearchingCar class
	@Then("I should get white cars in result")
	public void i_should_get_white_cars_in_result() {
		System.out.println("In select class: "+car.name);
		System.out.println("I should get white cars in result");
	}

	@Then("car must be atleast {int} years old")
	public void car_must_be_atleast_x_years_old(int age) {
		System.out.println("car must be atleast "+age+" years old");
	}

	@But("car should not be damaged")
	public void car_should_not_be_damaged() {
		System.out.println("car should not be damaged");
	}
}
