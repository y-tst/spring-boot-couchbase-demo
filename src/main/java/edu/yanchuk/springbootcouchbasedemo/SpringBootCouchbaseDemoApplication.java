package edu.yanchuk.springbootcouchbasedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

import java.time.LocalDate;
import java.util.UUID;



@SpringBootApplication
@EnableCouchbaseRepositories(basePackages = "edu.yanchuk.springbootcouchbasedemo")
public class SpringBootCouchbaseDemoApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {

//		User user = new User(
//				UUID.fromString("9e9a5147-8ebb-4344-a55a-b845aa6e2697"),
//				"john_doe@epam.com",
//				"John Doe",
//				LocalDate.of(1990, 10, 10),
//				Gender.MALE
//		);
//
//		System.out.println(user);


		SpringApplication.run(SpringBootCouchbaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Create a new user
		User newUser = new User();
		newUser.setEmail("john_doe@epam.com");
		newUser.setFullName("John Doe");
		newUser.setBirthDate(LocalDate.of(1990, 10, 10));
		newUser.setGender(Gender.MALE);

		// Save the user in Couchbase
		User createdUser = userService.createUser(newUser);

		System.out.println("Created User: " + createdUser);
	}
}
