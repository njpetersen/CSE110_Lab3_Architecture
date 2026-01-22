package edu.ucsd.spendingtracker.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class SummaryView extends BorderPane {
    private Label totalLabel;
    private Button backButton;

    public SummaryView() {
        this.setStyle("-fx-background-color: #FFFFFF;");
        this.setPadding(new Insets(0, 25, 0, 25));

        // Header
        Header header = new Header();

        // Center content
        VBox centerContent = new VBox(20);
        centerContent.setAlignment(Pos.CENTER);
        centerContent.setPrefSize(500, 400);

        Text titleText = new Text("Summary");
        titleText.setStyle("-fx-font-weight: bold; -fx-font-size: 24;");

        totalLabel = new Label("Total: $0.00");
        totalLabel.setStyle("-fx-font-size: 18;");

        centerContent.getChildren().addAll(titleText, totalLabel);

        // Footer with back button
        backButton = new Button("Back");
        backButton.setPrefSize(100, 30);

        HBox footer = new HBox();
        footer.setPrefHeight(30);
        footer.setAlignment(Pos.CENTER);
        footer.getChildren().add(backButton);

        this.setTop(header);
        this.setCenter(centerContent);
        this.setBottom(footer);
    }

    public void setTotal(double total) {
        totalLabel.setText("Total: $" + String.format("%.2f", total));
    }

    public Button getBackButton() {
        return backButton;
    }
}
