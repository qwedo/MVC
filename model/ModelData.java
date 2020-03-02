package com.javarush.task.Projects.MVC.model;

import com.javarush.task.Projects.MVC.bean.User;

import java.util.List;

public class ModelData {
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
