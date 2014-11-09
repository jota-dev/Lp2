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
public class Ferrocarriles extends Comprable{
    public Ferrocarriles(String name, int owner, int props, int ID){
        super(200, owner, props, ID, "Ferrocarriles");
    }
    public int getRent(int i){
        return rent[i];
    }
    private final int[] rent = {25, 50, 100, 200};
}
