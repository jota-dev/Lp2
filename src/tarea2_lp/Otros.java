package tarea2_lp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jc
 */
public class Otros extends Casilla{
    public Otros(){};
    public Otros(int ID, String typebox, String action){
        super(ID, typebox);
        this.action = action;
    }
    public String getAction() {
        
    }
    private String action;
}
