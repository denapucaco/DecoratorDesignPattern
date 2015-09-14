package com.sparsh.learning.design.patterns;

/**
 * @author prashant.swamy
 *
 */
public class PlainPizza implements Pizza {

    /*
     * (non-Javadoc)
     * @see com.sparsh.learning.design.patterns.Pizza#getDescription()
     */
    public String getDescription() {
        return "Thin Dough";
    }

    /*
     * (non-Javadoc)
     * @see com.sparsh.learning.design.patterns.Pizza#getPrice()
     */
    public double getPrice() {
        return 4.00;
    }

}
