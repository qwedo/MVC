package com.javarush.task.Projects.MVC.model;

import com.javarush.task.Projects.MVC.bean.User;

import java.util.ArrayList;
import java.util.List;

public class FakeModel implements Model {
    private ModelData modelData = new ModelData();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Alex", 1, 1));
        users.add(new User("Dan", 2, 1));

        modelData.setUsers(users);
    }
}
