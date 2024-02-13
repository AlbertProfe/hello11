package org.example.utils;

import java.util.Scanner;

public class CommonUtilities {

    public static String ask(Scanner scanner, String textToAsk) {

        System.out.println(textToAsk);
        return scanner.nextLine();
    }
}
