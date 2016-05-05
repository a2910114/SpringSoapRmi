package com.mykhaylenko.fakeservice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavlo.Mykhaylenko on 4/28/2016.
 */
public class UserServiceImpl implements UserService {

    private List<String> users;

    public UserServiceImpl() {
        users = new ArrayList<String>();
        users.add("user1");
    }

    public String getUser(int index) {
        return users.get(index);
    }

    public void addUser(String username) {
        users.add(username);
    }
}
