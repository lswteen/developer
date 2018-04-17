package com.sunu.project.developer;

import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeveloperApplication {

	@Data
	public static class TestProject{
		private String outputString;

		public void test(){
			setOutputString("Test hello springboot");
			System.out.println("==================================>".concat(outputString));
		}
	}

	public static void main(String[] args) {
		TestProject testProject = new TestProject();
		testProject.test();
		SpringApplication.run(DeveloperApplication.class, args);
	}
}
