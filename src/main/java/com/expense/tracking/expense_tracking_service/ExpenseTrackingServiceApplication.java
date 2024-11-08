package com.expense.tracking.expense_tracking_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = "com.expense")
@EnableMongoRepositories("com.expense.repository")
public class ExpenseTrackingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseTrackingServiceApplication.class, args);
	}

}
