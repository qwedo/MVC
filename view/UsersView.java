package com.javarush.task.Projects.MVC.view;

import com.javarush.task.Projects.MVC.controller.Controller;
import com.javarush.task.Projects.MVC.model.ModelData;
import com.javarush.task.Projects.MVC.bean.User;

public class UsersView implements View {
    private Controller controller;

    @Override
    public void refresh(ModelData modelData) {
        System.out.println("All users:");
        for (User user : modelData.getUsers())
            System.out.println("\t" + user);
        System.out.printf("===================================================");
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void fireEventShowAllUsers(){
        controller.onShowAllUsers();
    }
}
