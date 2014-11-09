/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2_lp;

/**
 *
 * @author Jc
 */
public class Jugadores {
    Jugadores(String name){
        this.name = name;
    }
    public void setPosition(int n){
        this.position = n;
    }
    public int getPosition(){
        return this.position;
    }
    public boolean isBroken(){
        return this.money <= 0;
    }
    public void addMoney(int n){
        this.money = money + n;
    }
    public void ban(int n){
        this.banned = n;
    }
    
    private final String name;
    private int position;
    private int banned;
    private int money;
}
