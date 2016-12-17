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

}

