package com.expense.tracking.expense_tracking_service;

import org.springframework.boot.SpringApplication;

public class TestExpenseTrackingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(ExpenseTrackingServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
