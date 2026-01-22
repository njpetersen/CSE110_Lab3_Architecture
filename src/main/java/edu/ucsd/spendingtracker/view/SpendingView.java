package edu.ucsd.spendingtracker.view;

import javafx.scene.layout.*;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class SpendingView extends BorderPane {
    
    private Header header;
    private ExpenseList expenseList;
    private Button summaryButton;

    public SpendingView() {
        header = new Header();
        expenseList = new ExpenseList();

        ScrollPane scroller = new ScrollPane(expenseList);
        scroller.setFitToWidth(true);
        scroller.setFitToHeight(true);
        
        // Remove the default ScrollPane border to make it blend in
        scroller.setStyle("-fx-background-color: transparent; -fx-viewport-fill: #FFFFFF; -fx-background: #FFFFFF; -fx-border-color: transparent;");

        // Set the background of the entire frame to match your theme
        this.setStyle("-fx-background-color: #FFFFFF;");

        // Use Padding instead of Margin to keep the color consistent
        this.setPadding(new Insets(0, 25, 0, 25)); 

        // Create and configure the summary button
        summaryButton = new Button("Summary");
        summaryButton.setPrefSize(100, 30);
        
        // Create a footer HBox to hold the button
        HBox footer = new HBox();
        footer.setPrefHeight(30);
        footer.setAlignment(Pos.CENTER);
        footer.getChildren().add(summaryButton);

        this.setTop(header);
        this.setCenter(scroller);
        this.setBottom(footer);
    }

    // Getter method to access the summaryButton
    public Button getSummaryButton() {
        return summaryButton;
    }

    public ExpenseList getExpenseList() {
        return expenseList;
    }
}
