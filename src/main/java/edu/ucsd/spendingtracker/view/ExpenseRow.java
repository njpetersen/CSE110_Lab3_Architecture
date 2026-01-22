package edu.ucsd.spendingtracker.view;

import edu.ucsd.spendingtracker.model.Expense;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.TextAlignment;

public class ExpenseRow extends HBox {
    private Label index;
    private Label expenseName;
    private Label categoryLabel;
    private Label amountLabel;

    public ExpenseRow(int idx, Expense expense) {
        this.setPrefSize(500, 40);
        this.setPadding(new Insets(5, 10, 5, 10));
        this.setAlignment(Pos.CENTER_LEFT);
        this.setSpacing(10);
        
        // Apply the category color to the entire row
        this.setStyle("-fx-background-color: " + expense.getCategory().color + "; -fx-border-color: #D3D3D3; -fx-border-width: 0 0 1 0; -fx-font-weight: bold; -fx-border-radius: 5px; -fx-background-radius: 5px;");

        index = new Label(idx + ".");
        index.setPrefWidth(30);

        expenseName = new Label(expense.getName());
        expenseName.setPrefWidth(220);

        categoryLabel = new Label("[" + expense.getCategory().name() + "]");
        categoryLabel.setPrefWidth(120);
        categoryLabel.setStyle("-fx-font-size: 10px; -fx-text-fill: #555555;");

        amountLabel = new Label("$" + String.format("%.2f", expense.getAmount()));
        amountLabel.setPrefWidth(80);
        amountLabel.setTextAlignment(TextAlignment.RIGHT);

        this.getChildren().addAll(index, expenseName, categoryLabel, amountLabel);
    }
}
