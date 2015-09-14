/**
 * 
 */
package com.sparsh.learning.design.patterns;

/**
 * @author prashant.swamy
 *
 */
public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza tempPizza) {
        super(tempPizza);
        System.out.println("Adding Sauce");
    }

    /*
     * (non-Javadoc)
     * @see com.sparsh.learning.design.patterns.Pizza#getDescription()
     */
    public String getDescription() {
        return tempPizza.getDescription() + ", TomatoSauce";
    }

    /*
     * (non-Javadoc)
     * @see com.sparsh.learning.design.patterns.Pizza#getPrice()
     */
    public double getPrice() {
        return tempPizza.getPrice() + 0.35;
    }

}
