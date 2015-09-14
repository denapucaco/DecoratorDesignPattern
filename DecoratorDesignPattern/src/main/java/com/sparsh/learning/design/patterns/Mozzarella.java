/**
 * 
 */
package com.sparsh.learning.design.patterns;

/**
 * @author prashant.swamy
 *
 */
public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza tempPizza) {
        super(tempPizza);
        System.out.println("Adding Dough");
        System.out.println("Adding Mozzarella");
    }

    /*
     * (non-Javadoc)
     * @see com.sparsh.learning.design.patterns.Pizza#getDescription()
     */
    public String getDescription() {
        return tempPizza.getDescription() + ", Mozzarella";
    }

    /*
     * (non-Javadoc)
     * @see com.sparsh.learning.design.patterns.Pizza#getPrice()
     */
    public double getPrice() {
        return tempPizza.getPrice() + 0.50;
    }

}
