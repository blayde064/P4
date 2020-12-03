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
public class ShippingContents {
    private double weight, length, height, width, value;
    private boolean perishable, fragile, hazardeous;

    public ShippingContents(double weight, double length, double height, double width, double value, boolean perishable, boolean fragile, boolean hazardeous) {
        this.weight = weight;
        this.length = length;
        this.height = height;
        this.width = width;
        this.value = value;
        this.perishable = perishable;
        this.fragile = fragile;
        this.hazardeous = hazardeous;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public boolean isPerishable() {
        return perishable;
    }

    public void setPerishable(boolean perishable) {
        this.perishable = perishable;
    }

    public boolean isFragile() {
        return fragile;
    }

    public void setFragile(boolean fragile) {
        this.fragile = fragile;
    }

    public boolean isHazardeous() {
        return hazardeous;
    }

    public void setHazardeous(boolean hazardeous) {
        this.hazardeous = hazardeous;
    }
    
}
