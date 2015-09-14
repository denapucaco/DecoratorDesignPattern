package com.sparsh.learning.design.patterns;

/**
 * @author prashant.swamy
 *
 */
public abstract class ToppingDecorator implements Pizza {

    protected Pizza tempPizza;

    public ToppingDecorator(Pizza tempPizza) {
        this.tempPizza = tempPizza;
    }

    /*
     * (non-Javadoc)
     * @see com.sparsh.learning.design.patterns.Pizza#getDescription()
     */
    public String getDescription() {
        return tempPizza.getDescription();
    }

    /*
     * (non-Javadoc)
     * @see com.sparsh.learning.design.patterns.Pizza#getPrice()
     */
    public double getPrice() {
        return tempPizza.getPrice();
    }

}
