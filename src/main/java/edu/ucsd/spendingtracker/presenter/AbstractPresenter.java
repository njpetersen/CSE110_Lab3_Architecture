package edu.ucsd.spendingtracker.presenter;

import javafx.scene.Scene;

public abstract class AbstractPresenter {
    public abstract Scene getView();
    public abstract String getViewTitle();
}
