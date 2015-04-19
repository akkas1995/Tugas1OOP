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
public class Player {
    private Hand hand;
    private int money;
    private String name;
    private int taruhan;
    private int bet;
    
    Player (String a, int b){
        name=a;
        money =b;
    }
    
    public int[] getnilai (Card a, Card b, Card c) {
        int A [][] = new int [3][2];
        A[0][0]=a.getstatus();
        A[0][1]=a.getnama();
        A[1][0]=b.getstatus();
        A[1][1]=b.getnama();
        A[2][0]=c.getstatus();
        A[2][1]=c.getnama();
        int B [][] = new int [2][2]; 
        B[0][0]=hand.getclosed1().getstatus();
        B[0][1]=hand.getclosed1().getnama();
        B[1][0]=hand.getclosed2().getstatus();
        B[1][0]=hand.getclosed2().getnama();
        return getnilainya (A,B);
    }
    public int[] getnilainya (int A[][],int B[][] ){
        int C [] = new int [2];
        int D [] = new int [5];
        D[0]=A[0][1];
        D[1]=A[1][1];
        D[2]=A[2][1];
        D[3]=B[0][1];
        D[4]=B[1][1];
        for (int i=0;i<5;i++){
            for (int j=0; j>4-i;i++){
                if (D[j+1]<D[j]){
                    int temp=D[j+1];
                    D[j+1]=D[j];
                    D[j]=temp;
                }
            }
        }
        if (((A[0][0]==A[1][0])&&(A[0][0]==A[2][0])&&(A[0][0]==B[0][0])&&(A[0][0]==B[1][0]))){
           C[0]=5;
           C[1]=A[0][0];
           if ((D[0]==1)&&((D[0]+D[1]+D[2]+D[3]+D[4])==47)){
               C[0]=1;
           }
           if (((D[0]+1)==D[1])&&((D[1]+1)==D[2])&&((D[2]+1)==D[3])&&((D[3]+1)==D[4])){
               C[0]=2;
           }
        }
        else if (((D[0]+1)==D[1])&&((D[1]+1)==D[2])&&((D[2]+1)==D[3])&&((D[3]+1)==D[4])){
               C[0]=6;
               C[1]=D[4];
           }
        else if ((D[0]==D[1])||(D[1]==D[2])||(D[2]==D[3])||(D[3]==D[4])){
            if (((D[0]==D[1])&&(D[1]==D[2])&&(D[2]==D[3]))||((D[3]==D[4])&&(D[1]==D[2])&&(D[2]==D[3]))){
                C[0]=3;
                C[1]=D[4];
            }
            else if (((D[0]==D[1])&&(D[0]==D[2]))||((D[1]==D[2])&&(D[2]==D[3]))||((D[2]==D[3])&&(D[3]==D[4]))){
                if (((D[0]==D[1])&&(D[0]==D[2]))&&(D[3]==D[4])){
                    C[0]=4;
                    C[1]=(D[0]*100)+D[3];
                }
                else if (((D[1]==D[2])&&(D[2]==D[3]))&&(D[0]==D[4])) {
                    C[0]=4;
                    C[1]=(D[1]*100)+D[0];
                }
                else if (((D[2]==D[3])&&(D[3]==D[4]))&&(D[0]==D[1])){
                    C[0]=4;
                    C[1]=(D[2]*100)+D[0];
                }
                else {
                    C[0]=7;
                    C[1]=D[2];
                }
                }
            else if (((D[0]==D[1])&&((D[2]==D[3])||D[3]==D[4]))||((D[1]==D[2])&&(D[3]==D[4]))){
                C[0]=9;
                C[1]=D[1]*100+D[3];
            }
            else {
                C[0]=8;
                if (D[0]==D[1]){
                    C[1]=D[0];
                }
                else if (D[1]==D[2]){
                    C[1]=D[1];
                }
                else if (D[2]==D[3]){
                    C[1]=D[2];
                }
                else if (D[3]==D[4]){
                    C[1]=D[3];
                }
                }
            }
        else {
            C[0]=10;
            C[1]=D[4];
        }
        
        return C;
    }
    public void setname (String a){
        name =a;
    }
    public void sethand (){
        Hand a = new Hand();
        hand=a;
    }
    public void setmoney  (int a){
        money = a;
    }
    public void raise (int a) throws Exception{
        if (money-bet<0){
            throw new Exception();
        }
        else {
        bet = bet + (a*2);
        taruhan =a;}
    }
    public void ikut () throws Exception{
        if (money-bet<0){
            throw new Exception();
        }
        else {
        bet = bet+taruhan;}
    }
    public void fold() {
       
    }
    public void setbet (int a){
        bet=a;
        taruhan=a;
    }
    public void lose () {
        money = money-bet;
    }
    public void win() {
        money =money+bet;
    }
    public int getmoney() {
        return money;
    }
    public Hand gethand(){
        return hand;
    }
    
   
}
