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
public class Card {

    private int nama;
    private int status;
    public void setnama (int a) {
        nama=a;
    }
    public void setstatus (int a){
        status=a;
    }
    public int getstatus () {
        return status;
    }
  
    public int getnama () {
        return nama;
    }
    Card (int a, int b){
        nama = a;
        status = b;
    }
   
}
/*
*1 = skop
2 = heart
3 = keriting
4 = wajik
*/