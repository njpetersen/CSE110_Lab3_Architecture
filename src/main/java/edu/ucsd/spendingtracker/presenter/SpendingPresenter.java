package edu.ucsd.spendingtracker.presenter;

import edu.ucsd.spendingtracker.model.Model;
import edu.ucsd.spendingtracker.view.SpendingView;
import javafx.scene.Scene;

public class SpendingPresenter extends AbstractPresenter {
    private final SpendingView view;
    private final Scene scene;
    private final Model model;
    private Runnable onShowSummary;

    public SpendingPresenter(Model model) {
        this.model = model;
        this.view = new SpendingView();
        this.scene = new Scene(view, 500, 600);
        initializeEventHandlers();
        refresh();
    }

    private void initializeEventHandlers() {
        view.getSummaryButton().setOnAction(e -> {
            if (onShowSummary != null) {
                onShowSummary.run();
            }
        });
    }

    public void refresh() {
        view.getExpenseList().setExpenses(model.getExpenses());
    }

    public void setOnShowSummary(Runnable callback) {
        this.onShowSummary = callback;
    }

    @Override
    public Scene getView() {
        return scene;
    }

    @Override
    public String getViewTitle() {
        return "Expenses";
    }
}
