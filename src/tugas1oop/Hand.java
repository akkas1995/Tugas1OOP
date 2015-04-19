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
public class Hand {
    private Card closed1;
    private Card closed2;
    public void setclosed1 ( Card a){
        closed1 =a;
    }
    public void setclosed2 (Card a){
        closed2=a;
    }
  
    public Card getclosed1() {
        return closed1;
    }
    public Card getclosed2() {
        return closed2;
    }
}
