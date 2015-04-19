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
public class Deck {
    private Card deck [];
    private int s;
    Deck () {
        deck  = new Card [52];
        Card A_1 = new Card (1,1);
        Card A_2 = new Card (2,1);
        Card A_3 = new Card (3,1);
        Card A_4 = new Card (4,1);
        Card A_5 = new Card (5,1);
        Card A_6 = new Card (6,1);
        Card A_7 = new Card (7,1);
        Card A_8 = new Card (8,1);
        Card A_9 = new Card (9,1);
        Card A_10 = new Card (10,1);
        Card A_11 = new Card (11,1);
        Card A_12 = new Card (12,1);
        Card A_13 = new Card (13,1);
        Card B_1 = new Card (1,2);
        Card B_2 = new Card (2,2);
        Card B_3 = new Card (3,2);
        Card B_4 = new Card (4,2);
        Card B_5 = new Card (5,2);
        Card B_6 = new Card (6,2);
        Card B_7 = new Card (7,2);
        Card B_8 = new Card (8,2);
        Card B_9 = new Card (9,2);
        Card B_10 = new Card (10,2);
        Card B_11 = new Card (11,2);
        Card B_12 = new Card (12,2);
        Card B_13 = new Card (13,2);
        Card C_1 = new Card (1,3);
        Card C_2 = new Card (2,3);
        Card C_3 = new Card (3,3);
        Card C_4 = new Card (4,3);
        Card C_5 = new Card (5,3);
        Card C_6 = new Card (6,3);
        Card C_7 = new Card (7,3);
        Card C_8 = new Card (8,3);
        Card C_9 = new Card (9,3);
        Card C_10 = new Card (10,3);
        Card C_11 = new Card (11,3);
        Card C_12 = new Card (12,3);
        Card C_13 = new Card (13,3);
        Card D_1 = new Card (1,4);
        Card D_2 = new Card (2,4);
        Card D_3 = new Card (3,4);
        Card D_4 = new Card (4,4);
        Card D_5 = new Card (5,4);
        Card D_6 = new Card (6,4);
        Card D_7 = new Card (7,4);
        Card D_8 = new Card (8,4);
        Card D_9 = new Card (9,4);
        Card D_10 = new Card (10,4);
        Card D_11 = new Card (11,4);
        Card D_12 = new Card (12,4);
        Card D_13 = new Card (13,4);
        deck [0]= A_1;
        deck [1]= A_2;
        deck [2]= A_3;
        deck [3]= A_4;
        deck [4]= A_5;
        deck [5]= A_6;
        deck [6]= A_7;
        deck [7]= A_8;
        deck [8]= A_9;
        deck [9]= A_10;
        deck [10]= A_11;
        deck [11]= A_12;
        deck [12]= A_13;
        deck [13]= B_1;
        deck [14]= B_2;
        deck [15]= B_3;
        deck [16]= B_4;
        deck [17]= B_5;
        deck [18]= B_6;
        deck [19]= B_7;
        deck [20]= B_8;
        deck [21]= B_9;
        deck [22]= B_10;
        deck [23]= B_11;
        deck [24]= B_12;
        deck [25]= B_13;
        deck [26]= C_1;
        deck [27]= C_2;
        deck [28]= C_3;
        deck [29]= C_4;
        deck [30]= C_5;
        deck [31]= C_6;
        deck [32]= C_7;
        deck [33]= C_8;
        deck [34]= C_9;
        deck [35]= C_10;
        deck [36]= C_11;
        deck [37]= C_12;
        deck [38]= C_13;
        deck [39]= D_1;
        deck [40]= D_2;
        deck [41]= D_3;
        deck [42]= D_4;
        deck [43]= D_5;
        deck [44]= D_6;
        deck [45]= D_7;
        deck [46]= D_8;
        deck [47]= D_9;
        deck [48]= D_10;
        deck [49]= D_11;
        deck [50]= D_12;
        deck [51]= D_13;
        s=-1;
        }
    public void shufle() {
        int i = (int)(Math.random()*100);
        for (int j=0;j<=i;j++){
            int k = (int)(Math.random()*100);
            for (int l=0;l<k;l++){
                int m = (int)(Math.random()*51);
                int n = (int)(Math.random()*51);
                Card temp=deck[m];
                deck[m]=deck[n];
                deck[n]=temp;
                temp=null;
            }
        }
            }
    public Card getcard () {
        s++;
        return deck[s];
    }
    }

