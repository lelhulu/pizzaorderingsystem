/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaordersystem;

/**
 *
 * @author lcao2
 */
public class Start {
    
    public static void main(String[] args) {
        PizzaOrderModel myModel =  new PizzaOrderModel();
        MenuFrame menuFrame = new MenuFrame(myModel);
        menuFrame.setVisible(true);
    }
}
