package util;

import com.github.javafaker.Faker;

public class FakerJava {
	Faker faker = new Faker();
	
	public String firstName = faker.name().firstName();
	public String lastName = faker.name().lastName();
	public String address = faker.address().streetAddress();
	public String city = faker.address().city();
	public String job = faker.job().title();
	

}
