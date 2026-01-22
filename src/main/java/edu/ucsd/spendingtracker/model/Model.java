package edu.ucsd.spendingtracker.model;

import edu.ucsd.spendingtracker.repository.ExpenseRepository;
import java.util.List;

public class Model {
    private ExpenseRepository repository;

    public Model(ExpenseRepository repository) {
        this.repository = repository;
    }

    public List<Expense> getExpenses() {
        return repository.getAllExpenses();
    }

    public void addExpense(Expense expense) {
        repository.addExpense(expense);
    }

    public double getTotalSpending() {
        return repository.getTotal();
    }
}
