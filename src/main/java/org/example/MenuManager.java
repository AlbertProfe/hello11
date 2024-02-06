package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class MenuManager {

    private HashMap<String, Menu> menus;
    private int size;
    private int maxSize;
    private String name;
    private String location;


    public MenuManager() {
        this.menus = new HashMap<String, Menu>();
    }

    public ArrayList<Menu> createFakeMenus (int size){



        return null;

    }

    public void saveMenu(Menu menu){

        menus.put("VETWE54", menu);
    }

    public HashMap<String, Menu> getMenus() {
        return menus;
    }

    public void setMenus(HashMap<String, Menu> menus) {
        this.menus = menus;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "MenuManager{" +
                "menus=" + menus +
                ", size=" + size +
                ", maxSize=" + maxSize +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
