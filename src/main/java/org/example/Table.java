package org.example;

public class Table {

    private String name;
    private String description;
    private int qty;

    public Table(String name, String description, int qty) {
        this.name = name;
        this.description = description;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Table{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", qty=" + qty +
                '}';
    }
}
