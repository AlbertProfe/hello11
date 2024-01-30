package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testMenus()
    {
        Menu menu1 = new Menu("Menu Lisboa", 25.00, "Meat, Salad, Tuna", true, true);
        Menu menu2 = new Menu();
        menu2.isActive();
        menu2.isWater();
        menu2.setContent("Meat, Salad, Fetaccis");
        menu2.setName("Menu New York");
        menu2.setPrice(23.00);


        System.out.println(menu1);
        System.out.println(menu2);

        assertTrue( true )


        ;
    }
}
