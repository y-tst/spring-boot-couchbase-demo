package edu.yanchuk.springbootcouchbasedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.UUID;

@SpringBootApplication
public class SpringBootCouchbaseDemoApplication {

	public static void main(String[] args) {

		User user = new User(
				UUID.fromString("9e9a5147-8ebb-4344-a55a-b845aa6e2697"),
				"john_doe@epam.com",
				"John Doe",
				LocalDate.of(1990, 10, 10),
				Gender.MALE
		);

		System.out.println(user);


//		SpringApplication.run(SpringBootCouchbaseDemoApplication.class, args);
	}

}
