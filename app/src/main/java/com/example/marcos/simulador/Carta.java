package com.example.marcos.simulador;

/**
 * Created by Marcos on 17/12/2016.
 */

public class Carta  {
    private int valor;
    //hay 4 tipos de palo: Clubs,Hearts, Diamonds y Spades
    private String palo;
    //de momento las cartas solo tienen valor, falta asignarles un palo

    public Carta(){
        valor = 0;
        palo="";
    }
    public Carta(int v, String p){
        palo = p;
        if(v>10 || v<1)valor =0;
        else valor = v;
    }
    public Carta(String v, String palo){
        if(v.equals("As")) valor = 14;
        else if(v.equals("K")) valor = 13;
        else if(v.equals("Q")) valor = 12;
        else if(v.equals("J")) valor = 11;
        else valor=0;
        this.palo=palo;
    }
    public int getValor(){
        return valor;
    }
    public String getPalo() { return palo; }
    public void setValor(int v){
        valor = v;
    }
    public void setPalo(String p) { palo=p; }

}
