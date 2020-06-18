package com.lab111.labwork9;

/**
 * The 'Director' class for the 'Builder' pattern
 * @author Diachenlo Tetiana
 */
public class TableLoader {

    /**
     * Field for holding a concrete builder
     */
    private TableBuilder tableBuilder;

    /**
     * Setter for concrete builder
     * @param tb - concrete table builder
     */
    public void setTableBuilder(TableBuilder tb) { tableBuilder = tb; }

    /**
     * Method for returning a ready table
     * @return resulting table
     */
    public RelationTable getTable() { return tableBuilder.getTable(); }

    /**
     * Method for creating a table
     */
    public void constructTable() {
        tableBuilder.createNewTable();
        tableBuilder.buildName();
        tableBuilder.buildEntries();
    }
}
