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
public final class Ciudad extends Comprable{
    public Ciudad(String color, int[] rent, String name, int builds, int b_price, int price, int owner, int props, int ID, String typebox){
        super(price, owner, props, ID, typebox);
        this.color = color; this.rent = rent; this.name = name;
        this.builds = builds; this.buld_price = b_price;
    }
    public int getRent(){
        return this.rent[this.builds];
    }
    public String getBlock(){
        return this.color;
    }
            
    private final String color;
    private int[] rent = new int[4];
    private final String name;
    private final int builds;
    private final int buld_price;
}
