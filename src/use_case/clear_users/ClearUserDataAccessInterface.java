package use_case.clear_users;

// TODO Complete me

import entity.User;

import java.util.ArrayList;

public interface ClearUserDataAccessInterface {
    ArrayList<User> getUsers();

    boolean existsByName(String identifier);
    void save(User user);

    void clear(User user);

    User get(String username);

    ArrayList<String> clearallusers();
}
