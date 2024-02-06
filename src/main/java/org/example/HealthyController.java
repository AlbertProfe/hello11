package org.example;


import java.util.Scanner;

public class HealthyController {
    // this method will start the app
    // it is core, here you will find the main loop
    public static void  start(){
        // create core objects
        // the app will use them very often
        Scanner scanner = new Scanner(System.in);
        MenuManager menuDB = new MenuManager();
        //menuDB.createFakeMenus(5);
        menuDB.setLocation("Paris");
        menuDB.setMaxSize(1000);
        menuDB.setName("db of menus healthyFood");

        // main loop controller with options
        while(true){

            mainMenu();
            String option = ask(scanner, "Option? ");

            if (option.equals("1")) {
                // i/o with user to save object
                // ask, create and save
                // call the method with the objects to i/o and save date
                createMenu(scanner, menuDB);

            } else if (option.equals("2")){
                //listMenus();
                System.out.println(menuDB);
            } else if (option.equals("0")){ break; }
        }
    }

    private static String ask(Scanner scanner, String textToAsk) {

        System.out.println(textToAsk);
        return scanner.nextLine();
    }

    public static void createMenu (Scanner scanner, MenuManager menuDB_toCreateAndSave){

        System.out.println("\nWelcome to CREATE Menu");
        Menu menu = new Menu();
        String name = ask (scanner, "Menu name? ");

        menu.setName(name);

        menuDB_toCreateAndSave.saveMenu(menu);

    }

    public static void mainMenu (){

        System.out.println("\n0 - Quit");
        System.out.println("1 - Create Menu");
        System.out.println("2 - List Menus");
        System.out.println("3 - Create Table");
        System.out.println("4 - List Tables");
        System.out.println("5 - Create Order");
        System.out.println("6 - List Orders");
        System.out.println("7 - Update Order\n");

    }
}
