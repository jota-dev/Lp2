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
public abstract class Core {
    public class Init{
        void init(){
            //indices de los arreglos!
            int a = 0;
            int o = 0;
            int c = 0;
            int f = 0;
            //Inicializacion lineal
            tablero[a] = new Casilla(o, "Otros");
            array_otros[o] = new Otros(o, "Otros", "Salida");
            o++;
            a++;
            {
            tablero[a] = new Casilla(c, "Ciudad");
            int[] b = {2,10,30,90,160,250};
            array_ciudad[c] = new Ciudad("Rojo", b, "Ovalle", 0, 50, 60, 0, 2, c, "Ciudad");
            c++;
            }
            a++;
            tablero[a] = new Casilla(0, "Suerte");
            a++;
            {
            tablero[a] = new Casilla(c, "Ciudad");
            int[] b = {4,20,60,180,320,450};
            array_ciudad[c] = new Ciudad("Rojo", b, "Punta Arenas", 0, 50, 60, 0, 2, c, "Ciudad");
            c++;
            a++;
            }
            tablero[a] = new Casilla(o, "Otros");
            array_otros[o] = new Otros(o, "Otros", "Impuestos");
            o++;
            a++;
            tablero[a] = new Casilla(f, "Ferrocarril");
            array_ferrocarril[f] = new Ferrocarriles("Ferrocarril Arica", 0,4, f);
            f++;
        }
        void getPlayers(){
            //Necesario capturar el numero de jugadores y pasarlo a la variable t
            //Se crea un arreglo vacío de todos los jugadores
            System.out.println("Ingrese numero de jugadores");
            t = 5;
            jugadores = new Jugadores[t];
        }
        void sortPlayers(){
            //Repartir turnos de jugadores en el arreglo
        }
    }
    public class Game{
        //Clase que ejecuta el loop de juego
        int getPosition(int playr){
            return jugadores[playr].getPosition();
        }
        void getCasilla(int pos, int playr_id){
            switch(tablero[pos].typebox){
                //Actua en base al tipo de casilla
                case "Ciudad":
                    //analisis de caso
                    Ciudad city = array_ciudad[pos];
                    Jugadores playr = jugadores[playr_id];
                    if(city.getOwner() == 0){
                        System.out.println("¿Quiere comprar esta propiedad?");
                        if(true){
                            playr.addMoney(-city.getPrice());
                            city.setOwner(playr_id);
                        }
                    }
                    else if(city.getOwner() != playr_id){
                        int rent = city.getRent();
                        playr.addMoney(-rent);
                        playr = jugadores[city.getOwner()];
                        playr.addMoney(rent);
                    }
                case "Otros":
                    if(array_otros[tablero[pos].ID].)
                case "Suertes":
                    //sgfd
                case "Ferrocarriles":
                    //fsdf
            }
        }
        public void doTaxes(int playr){
            jugadores[playr].addMoney(-100);
        }
        public void gotoJail(int playr){
            jugadores[playr].setPosition(10);
            jugadores[playr].ban(1);
        }
        public int canBuild(int id, int playr, String color){
            //Revisa las ciudades de un mismo color, si en una no es dueño, se devuelve 0
            int i;
            int b = 0;
            int cnt = 0;
            for(i = id;array_ciudad[i].getBlock() == color; i--){
                if(array_ciudad[i].getOwner() == playr)
                    cnt++;
                else
                    return 0;
            }
            for(i = id;array_ciudad[i].getBlock() == color; i++){
                if(array_ciudad[i].getOwner() == playr)
                    cnt++;
                else
                    return 0;
            }
            return playr;
        }
    }
    public class Refresh{
        //Refresca el estado de las casillas, principalmente orientado a modificar los dueños de las casillas
        //Podriamos modificar esto para que sólo actue en el "bloque" o tipo de casilla comprado
        private void refreshBlock(int ID, int playr){
            
        }
    }
    //Arreglos iniciales
    static int t;
    static Casilla[] tablero = new Casilla[40];
    static Ciudad[] array_ciudad = new Ciudad[22];
    static Ferrocarriles[] array_ferrocarril = new Ferrocarriles[4];
    static Servicios[] array_servicios = new Servicios[2];
    static Otros[] array_otros = new Otros[4];
    static Jugadores[] jugadores;
    
}
