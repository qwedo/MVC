package com.javarush.task.Projects.MVC.view;

import com.javarush.task.Projects.MVC.controller.Controller;
import com.javarush.task.Projects.MVC.model.ModelData;

public interface View {
    void refresh(ModelData modelData);
    void setController(Controller controller);
}
