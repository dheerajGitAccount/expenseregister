package com.expense.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.expense.model.Expense;
import com.expense.repository.ExpenseRepository;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    @Autowired
    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }


    public void createExpense(Expense expense) {

       expenseRepository.insert(expense);

    }


    public List<Expense> getAllExpense(){
       return expenseRepository.findAll();
    }

}
