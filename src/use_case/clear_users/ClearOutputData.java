package use_case.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearOutputData {
    private String creationTime;
    private final ArrayList<String> list;

    private boolean useCaseFailed;

    public ClearOutputData(ArrayList<String> list) {
        this.list = list;
    }

    public ArrayList<String> getUsers() {return list;}

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }
}
