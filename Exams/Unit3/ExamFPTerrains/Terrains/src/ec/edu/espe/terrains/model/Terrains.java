/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.terrains.model;

/**
 *
 * @author USER
 */
public class Terrains {
    private String Owner;
    private String Location;
    private float SquareMeter;
    private float Price;
    private boolean Papers;
    
    public Terrains(String Owner, String Location, float SquareMeter, float Price, boolean Papers) {
        this.Owner = Owner;
        this.Location = Location;
        this.SquareMeter = SquareMeter;
        this.Price = Price;
        this.Papers = Papers;
    }
    
    
    
    /**
     * @return the name
     */
    public String getOwner() {
        return Owner;
    }

    /**
     * @param Owner the name to set
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * @return the color
     */
    public String getLocation() {
        return Location;
    }

    /**
     * @param Location the color to set
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }
    
    public float getSquareMeter() {
        return SquareMeter;
    }

    /**
     * @param SquareMetert the weight to set
     */
    public void setSquareMetert(float SquareMeter) {
        this.SquareMeter = SquareMeter;
    }
    
    public float getPrice() {
        return Price;
    }

    /**
     * @param Price the weight to set
     */
    public void setPricet(float Price) {
        this.Price = Price;
    }
    
    public boolean getPapers() {
        return Papers;
    }

    /**
     * @param Papers the weight to set
     */
    public void setPapers(boolean Papers) {
        this.Papers = Papers;
    }
}
