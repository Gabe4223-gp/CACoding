package use_case.clear_users;

// TODO Complete me

public interface ClearOutputBoundary {
    StringBuilder prepareSuccessView(ClearOutputData user);

    void prepareFailView(String error);
}
