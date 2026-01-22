package edu.ucsd.spendingtracker;

import edu.ucsd.spendingtracker.datasource.InMemoryDataSource;
import edu.ucsd.spendingtracker.model.Model;
import edu.ucsd.spendingtracker.presenter.PresenterManager;
import edu.ucsd.spendingtracker.presenter.SpendingPresenter;
import edu.ucsd.spendingtracker.presenter.SummaryPresenter;
import edu.ucsd.spendingtracker.repository.ExpenseRepository;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create data layer
        InMemoryDataSource dataSource = new InMemoryDataSource();
        ExpenseRepository repository = new ExpenseRepository(dataSource);

        // Create domain layer
        Model model = new Model(repository);

        // Create presentation layer
        SpendingPresenter spendingPresenter = new SpendingPresenter(model);
        SummaryPresenter summaryPresenter = new SummaryPresenter(model);

        // Wire everything together
        PresenterManager manager = new PresenterManager();
        manager.defineInteractions(primaryStage, "Spending Tracker", 
                                   spendingPresenter, summaryPresenter);

        primaryStage.setResizable(false);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
