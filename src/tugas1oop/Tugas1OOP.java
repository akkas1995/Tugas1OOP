/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas1oop;

/**
 *
 * @author owner
 */
public class Tugas1OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player player_1 = new Player ("Agung", 2000);
        Player player_2 = new Player ("Budi", 2000);
        Player player_3 = new Player ("Ilham", 2000);
        Player player_4 = new Player ("Malik", 2000);
        player_1.sethand();
        player_2.sethand();
        player_3.sethand();
        player_4.sethand();
        Games game = new Games (player_1,player_2,player_3,player_3);
        game.putaran();
        
    }
    
}
