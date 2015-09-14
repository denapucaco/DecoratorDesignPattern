/**
 * 
 */
package com.sparsh.learning.design.patterns;

/**
 * @author prashant.swamy
 *
 */
public class PizzaMaker {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Pizza pizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

        System.out.println("Ingrediants: " + pizza.getDescription());

        System.out.println("Price: " + pizza.getPrice());
    }

}
