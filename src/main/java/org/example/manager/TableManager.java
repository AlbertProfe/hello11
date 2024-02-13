package org.example.manager;

import org.example.model.Table;
import org.example.utils.CommonUtilities;
import org.example.repository.TableRepository;

import java.util.Scanner;

public class TableManager {

    public static void createTable(Scanner scanner, TableRepository tableDB) {

        System.out.println("\nWelcome to CREATE Table");
        Table table = new Table();
        String name = CommonUtilities.ask(scanner, "Table name number");
        String description = CommonUtilities.ask(scanner, "Table description");

        table.setDescription(description);
        table.setName(name);

        tableDB.saveTable(table);


    }


}
