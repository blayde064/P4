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
public abstract class ShippingBox {
    private ShippingLabel currentShippingLabel;
    private ShippingContents currentShippingContents;
    
    public double getTotalCost(){
        return this.currentShippingLabel.getCost() + this.getValue();
    }

    public double getValue(){
        return this.currentShippingContents.getValue();
    }
    
    public ShippingLabel getCurrentShippingLabel() {
        return currentShippingLabel;
    }

    public void setCurrentShippingLabel(ShippingLabel currentShippingLabel) {
        this.currentShippingLabel = currentShippingLabel;
    }

    public ShippingContents getCurrentShippingContents() {
        return currentShippingContents;
    }

    public void setCurrentShippingContents(ShippingContents currentShippingContents) {
        this.currentShippingContents = currentShippingContents;
    }
    
}
