package com.example.marcos.simulador;
import java.util.ArrayList;
import java.util.Arrays;
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
    public int verMano(Carta a, Carta b){
        int contA =0;
        int contB=0;
        boolean color=false;
        int escalera=0;
        boolean poker=false;
        //p y s valor primera y segunda carta del jugador
        int p = a.getValor();
        int s = b.getValor();
        //c1 y c2 color de la carta 1 y 2 del jugador
        String c1 =a.getPalo();
        String c2 =b.getPalo();
        if(p==0 || s==0)return 0;
        Boolean pareja = p==s;

        int orden[]={-1, p,s,mesa[0].getValor(),mesa[1].getValor(),mesa[2].getValor(),mesa[3].getValor(),mesa[4].getValor()};
        String colorA[]={a.getPalo(),b.getPalo(),mesa[0].getPalo(),mesa[1].getPalo(),mesa[2].getPalo(),mesa[3].getPalo(),mesa[4].getPalo()};
        //arrays.sort ordena el array, lo hago para saber si son numeros consecutivos
        Arrays.sort(orden);

        if(orden[7]==14){
            orden[0]=1;
            //Arrays.sort(orden);
        }
        for(int i =0; i<orden.length-1 && escalera<4;i++){
            if((orden[i]+1)==orden[i+1])escalera++;
            else escalera=0;
        }



        int contador[]= new int[15];


        for(int i=1;i<orden.length;i++){
            if(contador[orden[i]]==0)contador[orden[i]]++;
            if((orden[i-1])==orden[i]) contador[orden[i]]++;
        }
        for(int i=0;i<contador.length;i++){
            System.out.println(i+" hay " +contador[i]);
            if(contador[i]==2)contA++;
            else if(contador[i]==3)contB++;
            else if(contador[i]>3)poker=true;
        }

        //hay 4 tipos de palo: Clubs,Hearts, Diamonds y Spades
        int Clubs=0,Hearts=0, Diamonds =0, Spades=0;

        for(int i =0;i<colorA.length;i++) {
            if(colorA[i].equals("Clubs"))Clubs++;
            else if(colorA[i].equals("Hearts"))Hearts++;
            else if(colorA[i].equals("Diamonds"))Diamonds++;
            else if(colorA[i].equals("Spades"))Spades++;

        }
        if(Clubs>=5||Hearts>=5||Diamonds>=5||Spades>=5)color =true;


        //for(int i =0; i<orden.length;i++){
           // System.out.println(i + " == " + orden[i]);
        //}
        boolean real=true;
        //System.out.println(orden);

        if(color && escalera>=4) {
            if(orden[7]==14){
                for(int i = orden.length-1; i>0 && orden[i-1]>9; i--) {
                    //System.out.println(i +" " + orden[i]+ " " +orden[i-1] );
                    if(orden[i]==orden[i-1] || orden[i]==(orden[i-1]+1)){

                        //System.out.println(i + " == " + orden[i]);
                    }
                    else real=false;

                }
            }
            if(real) return 1;
            else return 2;
        }
        //si contA o B tiene un 1 significa que tiene 2 cartas iguales y asi sucesivamente
        if(poker)return 3;
        if(contA>=1 && contB==1)return 4;

        if(color) return 5;

        if(escalera>=4) return 6;
        if(contB==1 && contA==0) return 7;
        if(contA==2 && contB==0)return 8;
        if((contA==1 && contB==0) )return 9;

        return 10;
/*
Esta es la lista de int que tiene que devolver segun el caso;
1 	Escalera real o flor imperial
2 	Escalera de color
3 	Póquer
4 	Full
5   Color
6 	Escalera
7 	Trío
8 	Doble pareja
9 	Pareja
10 	Carta alta
 */

    }

}

