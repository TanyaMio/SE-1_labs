package com.lab111.labwork9;

import java.util.ArrayList;

/**
 * The 'Product' class for the 'Builder' pattern
 * @author Diachenlo Tetiana
 */
public class RelationTable {
    /**
     * Field for holding the name of the table
     */
    private String name = "";
    /**
     * Field for holding entries of the table
     */
    private ArrayList<Entry> entries = new ArrayList<Entry>();

    /**
     * setter for table's name
     * @param n - name to set
     */
    public void setName(String n)     { this.name = n;}
    /**
     * setter for table's entries
     * @param e - collection of entries to set
     */
    public void setEntries(ArrayList<Entry> e)     { this.entries.addAll(e);}

    /**
     * Method for printing out the table
     * @return a string of the table
     */
    @Override
    public String toString() {
        String res = new String("Table Name: " + this.name + "\nEntries:\n");
        for (Entry e: this.entries) {
            res += new String(e.entry + "\n");
        }
        return res;
    }
}
