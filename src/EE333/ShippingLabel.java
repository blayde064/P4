/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EE333;

/**
 *
 * @author Blayde
 */
public class ShippingLabel {
    private ShippingAddress toShippingAdress, fromShippingAdress;
    private String id;
    private double cost;

    public ShippingLabel(ShippingAddress toShippingAdress, ShippingAddress fromShippingAdress, String id, double cost) {
        this.toShippingAdress = toShippingAdress;
        this.fromShippingAdress = fromShippingAdress;
        this.id = id;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    
    public ShippingAddress getToShippingAdress() {
        return toShippingAdress;
    }

    public void setToShippingAdress(ShippingAddress toShippingAdress) {
        this.toShippingAdress = toShippingAdress;
    }

    public ShippingAddress getFromShippingAdress() {
        return fromShippingAdress;
    }

    public void setFromShippingAdress(ShippingAddress fromShippingAdress) {
        this.fromShippingAdress = fromShippingAdress;
    }    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
