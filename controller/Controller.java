package com.javarush.task.Projects.MVC.controller;

import com.javarush.task.Projects.MVC.model.Model;
import com.javarush.task.Projects.MVC.view.UsersView;

public class Controller {
    private Model model;
    private UsersView usersView;

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void onShowAllUsers(){
        model.loadUsers();
        usersView.refresh(model.getModelData());
    }

    public void setUsersView(UsersView usersView) {
        this.usersView = usersView;
    }
}
