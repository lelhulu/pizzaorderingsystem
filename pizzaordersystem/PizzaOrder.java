/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaordersystem;

import java.util.ArrayList;

/**
 *
 * @author lcao2
 */
public class PizzaOrder {

    private int orderNumber;
    private int size;
    private ArrayList<Topping> toppings;
    private boolean completed;
    private static int currentOrderNumber = 1;

    public PizzaOrder(int size) {
        this.size = size;
        toppings = new ArrayList<>();
        completed = false;
        orderNumber = currentOrderNumber;
        currentOrderNumber++;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public boolean isCompleted() {

        return false;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void addTopping(Topping t) {
        toppings.add(t);
    }

    public double calculateOrderTotal() {
        if (size == 12) {
            double cost = 0;
            for (int i = 0; i < toppings.size(); i++) {
                cost += toppings.get(i).getPrice();
            }
            return 9.25 + cost;
        }

        if (size == 14) {
            double cost = 0;
            for (int i = 0; i < toppings.size(); i++) {
                cost += toppings.get(i).getPrice();
            }

            return 10.95 + cost;

        }
        if (size == 16) {
           double cost = 0;
            for (int i = 0; i < toppings.size(); i++) {
                cost += toppings.get(i).getPrice();
            }
            return 12.95 + cost;
        }
        if (size == 18) {
            double cost = 0;
            for (int i = 0; i < toppings.size(); i++) {
                cost += toppings.get(i).getPrice();
            }
            return 14.95 + cost;
        }
        return 0.0;
    }

    @Override
    public String toString() {

        return "OrderNumber:" + orderNumber + " Size: " + size + " Toppings: " + toppings;

    }

}
