package edu.ucsd.spendingtracker.view;

import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class Header extends HBox {
    public Header() {
        this.setPrefSize(500, 80);
        this.setStyle("-fx-background-color: #FFFFFF;");

        VBox container = new VBox();
        Text titleText = new Text("Spending Tracker");
        titleText.setStyle("-fx-font-weight: bold; -fx-font-size: 24;");
        
        container.getChildren().addAll(titleText);
        container.setAlignment(Pos.CENTER);
        
        this.getChildren().add(container);
        this.setAlignment(Pos.CENTER);
    }
}
