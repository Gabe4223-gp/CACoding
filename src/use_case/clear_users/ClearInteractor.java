package use_case.clear_users;

// TODO Complete me

import entity.User;
import entity.UserFactory;
import use_case.signup.*;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ClearInteractor {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;
    final UserFactory userFactory;

    public ClearInteractor(ClearUserDataAccessInterface clearDataAccessInterface,
                            ClearOutputBoundary clearOutputBoundary, UserFactory userFactory) {
        this.userDataAccessObject = clearDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
        this.userFactory = userFactory;
    }

    //@Override
    public StringBuilder execute(ClearInputData clearInputData) {
        ArrayList<String> deletedUsers = userDataAccessObject.clearallusers();

        ClearOutputData clearOutputData = new ClearOutputData(deletedUsers);
        return clearPresenter.prepareSuccessView(clearOutputData);
        /*
        LocalDateTime now = LocalDateTime.now();
        User user = userFactory.create(clearInputData.getUsername(), clearInputData.getPassword(), now);
        userDataAccessObject.clear(user);

        ClearOutputData clearOutputData = new ClearOutputData(user.getName(), now.toString(), false);
        clearPresenter.prepareSuccessView(clearOutputData);

         */



        /*
        LocalDateTime now = LocalDateTime.now();
        String csvPath = "./users.csv";
        ArrayList<String> users = userDataAccessObject.getUsers(csvPath);
            if (users.isEmpty()) {
                clearPresenter.prepareFailView("No information to delete.");
            }
            else {
                for (String user : users) {
                    ClearOutputData clearOutputData = new ClearOutputData(user, now.toString(), false);
                    clearPresenter.prepareSuccessView(clearOutputData);
                }
            }

         */

    }
}
