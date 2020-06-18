package com.lab111.labwork9;

/**
 * The 'AbstractBuilder' class for the 'Builder' pattern
 * @author Diachenlo Tetiana
 */
public abstract class TableBuilder {

    /**
     * Field for holding the table under creation
     */
    protected RelationTable table;

    /**
     * Method for returning created table
     * @return created table
     */
    public RelationTable getTable() { return table; }

    /**
     * Method for creating a new table
     */
    public void createNewTable() { table = new RelationTable(); }

    /**
     * Abstract method for setting table name
     */
    public abstract void buildName();

    /**
     * Abstract method for setting table entries
     */
    public abstract void buildEntries();
}
