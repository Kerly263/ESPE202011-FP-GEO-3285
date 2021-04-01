/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.terrains.controller;

import ec.edu.espe.terrains.model.Terrains;
import utils.FileManager;

/**
 *
 * @author USER
 */
public class TerrainsController {
    
    public void save(Terrains terrains){
        String data = terrains.getOwner() + "," + terrains.getLocation() + "," + terrains.getSquareMeter() + "," + terrains.getPrice() + "," +terrains.getPapers(); 
        FileManager.save(data, "terrains");
    }
    
}
