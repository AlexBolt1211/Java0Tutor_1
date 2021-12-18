package by.traning.tutor.classes.task14;

import java.util.ArrayList;
import java.util.List;


public class User {
    private String name;
    private final List<Accounts> accounts;


    public User(String name, List<Accounts> accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Accounts> getAccounts() {
        return new ArrayList<>(accounts);
    }

}
