package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;
import use_case.clear_users.ClearInputData;
import use_case.clear_users.ClearInteractor;

// TODO Complete me
public class ClearController {
    final ClearInteractor clearUseCaseInteractor;

    public ClearController(ClearInteractor clearUseCaseInteractor) {
        this.clearUseCaseInteractor = clearUseCaseInteractor;
    }

    public void execute() {
        ClearInputData clearInputData = new ClearInputData();
        clearUseCaseInteractor.execute(clearInputData);
    }
}
