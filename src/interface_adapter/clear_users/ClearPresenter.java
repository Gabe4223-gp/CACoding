package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;
    private ViewManagerModel viewManagerModel;

    public ClearPresenter(ClearViewModel clearViewModel, ViewManagerModel viewManagerModel) {
        this.clearViewModel = clearViewModel;
        this.viewManagerModel = viewManagerModel;
    }

    @Override
    public StringBuilder prepareSuccessView(ClearOutputData response) {
        // On success, switch to the clear view.
        ClearState clearState = clearViewModel.getState();
        clearState.setUsernames(response.getUsers());
        this.clearViewModel.setState(clearState);
        this.clearViewModel.firePropertyChanged();

        viewManagerModel.setActiveView(clearViewModel.getViewName());
        viewManagerModel.firePropertyChanged();
        return null;
    }

    @Override
    public void prepareFailView(String error) {
        ClearState clearState = clearViewModel.getState();
        clearState.setUsernameError(error);
        clearViewModel.firePropertyChanged();
    }
}
