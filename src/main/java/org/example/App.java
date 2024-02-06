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

        // invoke controller
        // call static start methods from class HealthyController
        // because it will start the app
        HealthyController.start();

        System.out.println( "Finish" );








    }
}
