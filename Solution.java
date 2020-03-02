package com.javarush.task.Projects.MVC;

import com.javarush.task.Projects.MVC.controller.Controller;
import com.javarush.task.Projects.MVC.model.MainModel;
import com.javarush.task.Projects.MVC.model.Model;
import com.javarush.task.Projects.MVC.view.UsersView;

public class Solution {
    public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        Controller controller = new Controller();
        usersView.setController(controller);
        controller.setModel(model);
        controller.setUsersView(usersView);
        usersView.fireEventShowAllUsers();
    }
}