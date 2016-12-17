package com.example.marcos.simulador;

/**
 * Created by Marcos on 17/12/2016.
 */

public class Mesa {
    private Carta mesa[]= new Carta[5];

    public Mesa(){
        for(int i =0; i<mesa.length;i++) {
            mesa[i].setValor(0);
        }
    }
    public Mesa(Carta a,Carta b, Carta c, Carta d, Carta e){
        mesa[0]=a;
        mesa[1]=b;
        mesa[2]=c;
        mesa[3]=d;
        mesa[4]=e;
    }
    public int comparar(Carta a, Carta b, Mesa m){
        int p= a.getValor();
        int s =b.getValor();
        Boolean pareja = p==s;
        Boolean trio = false;
        Boolean poker = false;

        for(int i =0; i<mesa.length;i++){
            if(mesa[i].getValor() == p && pareja && trio==false) trio= true;
                else if(pareja && trio) poker = true;
                    else pareja = true;

        }
    }

}

