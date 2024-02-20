package org.example.manager;

import org.example.model.Order;
import org.example.repository.OrderRepository;
import org.example.repository.TableRepository;
import org.example.utils.CommonUtilities;

import java.util.Scanner;

public class OrderManager {


    public static OrderRepository createDB (){
        OrderRepository orderRepoDB = new OrderRepository();
        orderRepoDB.setLocation("Paris");
        orderRepoDB.setMaxSize(1000);
        orderRepoDB.setName("db of orders healthyFood");
        return orderRepoDB;
    }

    public static void createOrder(Scanner scanner,
                                   OrderRepository orderRepoDB,
                                   TableRepository tableRepoDB){

        Order order1 = new Order();


        // create date

        String waiter = CommonUtilities.ask(scanner, "Waiter? ");
        // qty

        order1.setWaiter(waiter);

        // create a for each java with tables hashmap to print available tables
        // the goal is printing an option menu with 0 take away  and then set order.table to null
        // and all tables with index++


        // if take away

        order1.setTable(null);

        // if table#4

        //order1.setTable();

        // while of menus ... to save each menu to arraylist
        // order1.getMenus

        orderRepoDB.saveOrder(order1);

    }

}
