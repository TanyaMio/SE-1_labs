package com.lab111.labwork9;

import java.util.ArrayList;

/**
 * The 'ConcreteBuilder' class for the 'Builder' pattern
 * @author Diachenlo Tetiana
 */
public class ConcreteTableBuilder extends TableBuilder {

    /**
     * Method for setting table name
     */
    public void buildName()   { table.setName("Relation Table 1"); }
    /**
     * Method for setting table entries
     */
    public void buildEntries()   {
        ArrayList<Entry> ent = new ArrayList<Entry>();
        ent.add(new Entry("Entry 1.0"));
        ent.add(new Entry("Entry 1.1"));
        ent.add(new Entry("Entry 1.2"));
        table.setEntries(ent);
    }
}
