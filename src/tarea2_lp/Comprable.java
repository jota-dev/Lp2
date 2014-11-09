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
public class Comprable extends Casilla{
    public Comprable(int price, int owner, int properties, int ID, String typebox){
        super(ID, typebox);
        this.price = price; this.owner = owner; this.properties = properties;
    }
        public int getPrice(){
        return this.price;
    }
        public void setOwner(int own){
        this.owner = own;
    }
        public int getOwner(){
        return this.owner;
    }
        public void addProps(){
            this.properties++;
    }
        public int getProps(){
            return this.properties;
    }
    private final int price;
    private int owner;
    private int properties;
}
