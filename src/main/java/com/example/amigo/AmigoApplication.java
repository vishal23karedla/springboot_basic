package com.example.amigo;

import com.example.amigo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController

public class AmigoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmigoApplication.class, args);
		System.out.println("Hello world!");
	}

	@GetMapping
	public List<Student> hello()
	{
		return List.of(
				new Student(
						1L,
						"Vishal",
						"vishal@gmail.com",
						LocalDate.of(2000, Month.JANUARY, 12),
						22
				)
		);
	}

}
