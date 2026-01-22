package edu.ucsd.spendingtracker.repository;

import edu.ucsd.spendingtracker.datasource.InMemoryDataSource;
import edu.ucsd.spendingtracker.model.Expense;
import java.util.List;

public class ExpenseRepository {
    private InMemoryDataSource dataSource;

    public ExpenseRepository(InMemoryDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Expense> getAllExpenses() {
        return dataSource.getAllExpenses();
    }

    public void addExpense(Expense expense) {
        dataSource.addExpense(expense);
    }

    public double getTotal() {
        return dataSource.getAllExpenses().stream()
                .mapToDouble(Expense::getAmount)
                .sum();
    }
}
