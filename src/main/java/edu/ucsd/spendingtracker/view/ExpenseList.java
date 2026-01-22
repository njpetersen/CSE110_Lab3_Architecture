package edu.ucsd.spendingtracker.view;

import edu.ucsd.spendingtracker.model.Expense;
import javafx.scene.layout.VBox;
import java.util.List;

public class ExpenseList extends VBox {
    public ExpenseList() {
        this.setSpacing(5);
        this.setPrefSize(500, 560);
        this.setStyle("-fx-background-color: #FFFFFF;");
    }

    public void setExpenses(List<Expense> expenses) {
        this.getChildren().clear();
        int index = 1;
        for (Expense expense : expenses) {
            this.getChildren().add(new ExpenseRow(index++, expense));
        }
    }
}
