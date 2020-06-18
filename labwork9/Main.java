package com.lab111.labwork9;

public class Main {
    public static void main(String[] args) {
        TableLoader tl = new TableLoader();
        TableBuilder tableBuilder = new ConcreteTableBuilder();
        tl.setTableBuilder(tableBuilder);
        tl.constructTable();

        RelationTable table = tl.getTable();

        System.out.println("Resulting table:\n" + table);
    }
}
