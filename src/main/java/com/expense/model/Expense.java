package com.expense.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("expense")
public class Expense {
    @Id
    private String id;
    @Field(name="name")
    @Indexed(unique = true)
    private String expenseName;
    @Field(name="category")
    private ExpenseCategory expenseCategroy;
    @Field(name="amount")
    private BigDecimal expenseAmount;

    public Expense(){}
    
    public Expense(String id, String expenseName, ExpenseCategory expenseCategroy, BigDecimal expenseAmount) {
        this.id = id;
        this.expenseName = expenseName;
        this.expenseCategroy = expenseCategroy;
        this.expenseAmount = expenseAmount;
    }

    public String getId() {
        return id;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public ExpenseCategory getExpenseCategroy() {
        return expenseCategroy;
    }

    public BigDecimal getExpenseAmount() {
        return expenseAmount;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public void setExpenseCategroy(ExpenseCategory expenseCategroy) {
        this.expenseCategroy = expenseCategroy;
    }

    public void setExpenseAmount(BigDecimal expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

}
