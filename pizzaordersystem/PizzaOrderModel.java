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
public class PizzaOrderModel {

    private ArrayList<PizzaOrder> orders = new ArrayList<>();

    public void addOrder(PizzaOrder o) {
        orders.add(o);
    }

    //FIXME: Implement completeOrder() method
    public double completeOrder(int orderNum) {
        for (int i = 0; i < orders.size(); i++) {
            if (orderNum == orders.get(i).getOrderNumber()) {
                if (orders.get(i).isCompleted() == false) {
                    orders.get(i).setCompleted(true);
                    return orders.get(i).calculateOrderTotal();
                }
            }

        }
        return -1;

    }

    //FIXME: Implement cancelOrder() method
    public boolean cancelOrder(int orderNum) {
        for (int i = 0; i < orders.size(); i++) {
            if (orderNum == orders.get(i).getOrderNumber()) {
                if (orders.get(i).isCompleted()) {
                    return false;

                }
                orders.remove(i);
                return true;
            }

        }
        return false;

    }

    //FIXME: Implement displayIncompleteOrders() method
    public String displayIncompleteOrders() {
        String res = "";
        for (int i = 0; i < orders.size(); i++) {
            res = res.concat(orders.get(i).toString());
        }
        return res;
    }
}
