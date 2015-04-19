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
public class Games {
    private static int dealer;
    public Card Tabel1;
    public Card Tabel2;
    public Card Tabel3;
    public Deck deck;
    private Player A[];
    Games (Player player_1, Player player_2, Player player_3, Player player_4){
        A = new Player[4];
        A[0]=player_1;
        A[1]=player_2;
        A[2]=player_3;
        A[3]=player_4;
        deck = new Deck ();
        deck.shufle();
    }
    public void putaran (){
        dealer = (int)Math.random()*4;
        Tabel1=deck.getcard();
         A[dealer].gethand().setclosed1(deck.getcard());
        A[(dealer+1)%4].gethand().setclosed1(deck.getcard());
        A[(dealer+2)%4].gethand().setclosed1(deck.getcard());
        A[(dealer+3)%4].gethand().setclosed1(deck.getcard());
        try {
        A[dealer].setbet(100);
        }
        catch (Exception e){
                System.out.println ("Uang Habis");
                }
        try {
        A[(dealer+1)%4].ikut();
        }
        catch (Exception e){
                System.out.println ("Uang Habis");
                }
        try {
        A[(dealer+2)%4].raise(300);
        }
        catch (Exception e){
                System.out.println ("Uang Habis");
                }
        try {
        A[(dealer+3)%4].ikut();
        }
        catch (Exception e){
                System.out.println ("Uang Habis");
                }
        Tabel2=deck.getcard();
        A[dealer].gethand().setclosed2(deck.getcard());
        A[(dealer+1)%4].gethand().setclosed2(deck.getcard());
        A[(dealer+2)%4].gethand().setclosed2(deck.getcard());
        A[(dealer+3)%4].gethand().setclosed2(deck.getcard());
        try{
        A[dealer].fold();
        }
        catch (Exception e){
                System.out.println ("Uang Tidak Sudah Mines");
                }
        try{
            A[(dealer+1)%4].ikut();
        }
            catch (Exception e){
                System.out.println ("Uang Tidak Sudah Mines");
                }
        try{
        A[(dealer+2)%4].ikut();
        }
         catch (Exception e){
                System.out.println ("Uang Tidak Sudah Mines");
                }
        try {
        A[(dealer+3)%4].ikut();
        }
         catch (Exception e){
                System.out.println ("Uang Tidak Sudah Mines");
                }
        Tabel3=deck.getcard();
      
        setwinner(A[0].getnilai(Tabel1, Tabel1, Tabel1),A[1].getnilai(Tabel1, Tabel1, Tabel1),A[2].getnilai(Tabel1, Tabel1, Tabel1),A[3].getnilai(Tabel1, Tabel1, Tabel1));
        
    }
    private void setwinner(int A[], int B[], int C[], int D[]) {
        int E[][] = new int [4][3];
        E[0][0]=A[0];
        E[0][1]=A[1];
        E[0][2]=1;
        E[1][0]=B[0];
        E[1][1]=B[1];
        E[1][2]=2;
        E[2][0]=C[0];
        E[2][1]=C[1];
        E[2][2]=3;
        E[3][0]=D[0];
        E[3][1]=D[1];
        E[3][2]=4;
        for (int i=0;i<4;i++){
            for (int j=0; j>3-i;i++){
                if (E[j+1][0]<E[j][0]){
                    int temp=E[j+1][0];
                    E[j+1][0]=E[j][0];
                    E[j][0]=temp;
                    temp=E[j+1][1];
                    E[j+1][1]=E[j][1];
                    E[j][1]=temp;
                    temp=E[j+1][2];
                    E[j+1][2]=E[j][2];
                    E[j][2]=temp;
                        }
                    }
                }
        for (int i=0;i<4;i++){
            for (int j=0; j>3-i;i++){
                if (E[j+1][1]<E[j][1]){
                    int temp=E[j+1][0];
                    E[j+1][0]=E[j][0];
                    E[j][0]=temp;
                    temp=E[j+1][1];
                    E[j+1][1]=E[j][1];
                    E[j][1]=temp;
                    temp=E[j+1][2];
                    E[j+1][2]=E[j][2];
                    E[j][2]=temp;
                        }
                    }
                }
    Winner(E[3][2]);
    }
    private void Winner(int a){
        if (a==1){
            A[0].win();
            A[1].lose();
            A[2].lose();
            A[2].lose();
        }
        else if (a==2){
            A[0].lose();
            A[1].win();
            A[2].lose();
            A[2].lose();
        }
        else if (a==3){
            A[0].lose();
            A[1].lose();
            A[2].win();
            A[2].lose();
        }
        else if (a==4){
            A[0].lose();
            A[1].lose();
            A[2].lose();
            A[2].win();
        }
    }
}
