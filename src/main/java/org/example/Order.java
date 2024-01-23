package org.example;

import java.util.ArrayList;
import java.util.Date;


public class Order {

    private Date date;
    private String waiter;
    private int peopleQty;
    private double totalPayment;
    private boolean paid;
    Table table;
    ArrayList<Menu> menus = new ArrayList<>();

    public Order(Date date, String waiter, int peopleQty, double totalPayment, boolean paid, Table table, ArrayList<Menu> menus) {
        this.date = date;
        this.waiter = waiter;
        this.peopleQty = peopleQty;
        this.totalPayment = totalPayment;
        this.paid = paid;
        this.table = table;
        this.menus = menus;
    }

    public Order(){}

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getWaiter() {
        return waiter;
    }

    public void setWaiter(String waiter) {
        this.waiter = waiter;
    }

    public int getPeopleQty() {
        return peopleQty;
    }

    public void setPeopleQty(int peopleQty) {
        this.peopleQty = peopleQty;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public ArrayList<Menu> getMenus() {
        return menus;
    }

    public void setMenus(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "date=" + date +
                ", waiter='" + waiter + '\'' +
                ", peopleQty=" + peopleQty +
                ", totalPayment=" + totalPayment +
                ", paid=" + paid +
                ", table=" + table +
                ", menus=" + menus +
                '}';
    }
}
