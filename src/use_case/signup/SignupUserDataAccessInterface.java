package use_case.signup;

import entity.User;

import java.io.IOException;
import java.util.ArrayList;

public interface SignupUserDataAccessInterface {

    ArrayList<String> getUsers(String csvPath) throws IOException;

    boolean existsByName(String identifier);

    void save(User user);

    void clear(User user);
}
