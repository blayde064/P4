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
public interface Shippable {
    ShippingAddress shippingAddress; 
    
    ShippingContents shippingContents;

    public ShippingContents getShippingContents() {
        return shippingContents;
    }

    public void setShippingContents(ShippingContents shippingContents) {
        this.shippingContents = shippingContents;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
}
