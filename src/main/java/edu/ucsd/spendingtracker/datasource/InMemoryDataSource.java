package edu.ucsd.spendingtracker.datasource;

import edu.ucsd.spendingtracker.model.Expense;
import java.util.ArrayList;
import java.util.List;

public class InMemoryDataSource {
    private List<Expense> expenses;

    public InMemoryDataSource() {
        this.expenses = new ArrayList<>();
        // Pre-populate with hardcoded data
        expenses.add(new Expense("Groceries", edu.ucsd.spendingtracker.model.Category.FOOD, 101.75));
        expenses.add(new Expense("Utilities", edu.ucsd.spendingtracker.model.Category.UTILITIES, 80.50));
        expenses.add(new Expense("Gas", edu.ucsd.spendingtracker.model.Category.TRANSPORT, 60.00));
        expenses.add(new Expense("Movie Tickets", edu.ucsd.spendingtracker.model.Category.ENTERTAINMENT, 30.00));
        expenses.add(new Expense("Online Order", edu.ucsd.spendingtracker.model.Category.OTHER, 45.25));
    }

    public List<Expense> getAllExpenses() {
        return new ArrayList<>(expenses);
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public void clear() {
        expenses.clear();
    }
}
