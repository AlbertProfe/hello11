package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import com.github.javafaker.Faker;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello healthyFood Restaurant!" );

        Menu menu1 = new Menu("Menu Lisboa", 25.00, "Meat, Salad, Tuna", true, true);
        Menu menu2 = new Menu();
        menu2.isActive();
        menu2.isWater();
        menu2.setContent("Meat, Salad, Fetaccis");
        menu2.setName("Menu New York");
        menu2.setPrice(23.00);


        System.out.println(menu1);
        System.out.println(menu2);

        HashMap<String, Menu> menusTest = new HashMap<String, Menu>();

        menusTest.put("M001", menu1);
        menusTest.put("M002", menu2);

        System.out.println(menusTest);

        HashMap<String, Table> tables = new HashMap<String, Table>();
        tables.put("T01", new Table("Table1", "Table type Estrella Galicia", 4));
        tables.put("T02", new Table("Table2", "Table type Estrella Galicia", 4));
        tables.put("T03", new Table("Table3", "Table type Estrella Galicia", 2));
        tables.put("T04", new Table("Table4", "Table type Estrella Galicia", 2));

        System.out.println(tables);

        HashMap<String, Order> orders = new HashMap<String, Order>();

        ArrayList<Menu> menusToOrders = new ArrayList<Menu>();

        menusToOrders.add(menusTest.get("M001"));
        menusToOrders.add(menusTest.get("M001"));
        menusToOrders.add(menusTest.get("M001"));
        menusToOrders.add(menusTest.get("M002"));

        orders.put("43F43WT", new Order(new Date(), "Joan", 4,
                60.00, true, tables.get("T01"), menusToOrders ));

        System.out.println(orders);

        Faker faker = new Faker();

        String food1 = faker.food().measurement();
        String food2 = faker.food().dish();
        String food3 = faker.food().sushi();
        String food4 = faker.food().fruit();




    }
}
