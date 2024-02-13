package org.example.manager;

import org.example.model.Menu;
import org.example.utils.CommonUtilities;
import org.example.repository.MenuRepository;

import java.util.Scanner;

public class MenuManager {

    public static void createMenu (Scanner scanner, MenuRepository menuDB_toCreateAndSave){

        System.out.println("\nWelcome to CREATE Menu");
        Menu menu = new Menu();
        String name = CommonUtilities.ask (scanner, "Menu name? ");

        menu.setName(name);

        menuDB_toCreateAndSave.saveMenu(menu);

    }

    public static MenuRepository createDB (){
        MenuRepository menuRepoDB = new MenuRepository();
        menuRepoDB.setLocation("Paris");
        menuRepoDB.setMaxSize(1000);
        menuRepoDB.setName("db of menus healthyFood");
        return menuRepoDB;
    }

}
