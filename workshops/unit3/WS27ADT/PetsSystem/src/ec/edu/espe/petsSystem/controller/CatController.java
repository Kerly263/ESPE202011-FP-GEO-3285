/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.petsSystem.controller;

import ec.edu.espe.petsSystem.model.Cat;
import utils.FileManager;
/**
 *
 * @author USER
 */
public class CatController {

   
    
    public void save(Cat cat){
        String data = cat.getName() + "," + cat.getColor() + "," + cat.getRace() + "," + cat.getAge() + "," +cat.getWeight(); 
        FileManager.save(data, "cats");
    }
    
    public String read(){
        String data;
        data = FileManager.read("cats,txt");
        return data;
    }
}
