package edu.ucsd.spendingtracker.presenter;

import edu.ucsd.spendingtracker.model.Model;
import edu.ucsd.spendingtracker.view.SummaryView;
import javafx.scene.Scene;

public class SummaryPresenter extends AbstractPresenter {
    private final SummaryView view;
    private final Scene scene;
    private final Model model;
    private Runnable onBack;

    public SummaryPresenter(Model model) {
        this.model = model;
        this.view = new SummaryView();
        this.scene = new Scene(view, 500, 600);
        initializeEventHandlers();
    }

    private void initializeEventHandlers() {
        view.getBackButton().setOnAction(e -> {
            if (onBack != null) {
                onBack.run();
            }
        });
    }

    public void refresh() {
        view.setTotal(model.getTotalSpending());
    }

    public void setOnBack(Runnable callback) {
        this.onBack = callback;
    }

    @Override
    public Scene getView() {
        return scene;
    }

    @Override
    public String getViewTitle() {
        return "Summary";
    }
}
