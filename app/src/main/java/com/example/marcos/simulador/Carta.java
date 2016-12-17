package com.example.marcos.simulador;

/**
 * Created by Marcos on 17/12/2016.
 */

public class Carta  {
    private int valor;

    public Carta(){
        valor = 0;
    }
    public Carta(int v){
        if(v>10 || v<1)valor =0;
        else valor = v;
    }
    public Carta(String v){
        if(v.equals("As")) valor = 13;
        else if(v.equals("K")) valor = 13;
        else if(v.equals("Q")) valor = 12;
        else if(v.equals("J")) valor = 11;
        else valor=0;
    }
    public int getValor(){
        return valor;
    }
    public void setValor(int v){
        valor = v;
    }
    public void setValor(String v){
        if(v.equals("As")) valor = 13;
        else if(v.equals("K")) valor = 13;
        else if(v.equals("Q")) valor = 12;
        else if(v.equals("J")) valor = 11;
        else valor=0;
    }
}
