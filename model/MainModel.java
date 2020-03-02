package com.javarush.task.Projects.MVC.model;

import com.javarush.task.Projects.MVC.model.service.UserService;
import com.javarush.task.Projects.MVC.model.service.UserServiceImpl;
import com.javarush.task.Projects.MVC.bean.User;

import java.util.List;

public class MainModel implements Model {
    private ModelData modelData = new ModelData();
    private UserService userService = new UserServiceImpl();


    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        List<User> users = userService.getUsersBetweenLevels(1, 100);
        modelData.setUsers(users);
    }
}
