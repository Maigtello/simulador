package com.example.marcos.simulador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Spinner spinner0,spinner1,spinner2,spinner3,spinner4,spinner5,spinner6,spinner7,spinner8,
            spinner9,spinner10,spinner11,spinner12,spinner13,spinner14,spinner15,spinner16,spinner17;
    private Button buttonCalcular;
    private TextView textViewR;
    private String pantalla="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //jugador1
        spinner0 = (Spinner) findViewById(R.id.spinner0);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner9 =(Spinner) findViewById(R.id.spinner9);
        spinner10 =(Spinner) findViewById(R.id.spinner10);
        //jugador2
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        spinner11 = (Spinner) findViewById(R.id.spinner11);
        spinner12 = (Spinner) findViewById(R.id.spinner12);
        //mesa
        spinner4 = (Spinner) findViewById(R.id.spinner4);
        spinner5 = (Spinner) findViewById(R.id.spinner5);
        spinner6 = (Spinner) findViewById(R.id.spinner6);
        spinner7 = (Spinner) findViewById(R.id.spinner7);
        spinner8 = (Spinner) findViewById(R.id.spinner8);
        spinner13 = (Spinner) findViewById(R.id.spinner13);
        spinner14 = (Spinner) findViewById(R.id.spinner14);
        spinner15 = (Spinner) findViewById(R.id.spinner15);
        spinner16 = (Spinner) findViewById(R.id.spinner16);
        spinner17 = (Spinner) findViewById(R.id.spinner17);

        buttonCalcular = (Button) findViewById(R.id.buttonCalcular);
        textViewR = (TextView) findViewById(R.id.textViewResult);
    }
    public void onClick(View view){
        Carta jugador1A= new Carta();
        Carta jugador1B = new Carta();
        Carta jugador2A = new Carta();
        Carta jugador2B = new Carta();
        Carta mesaA= new Carta();
        Carta mesaB = new Carta();
        Carta mesaC = new Carta();
        Carta mesaD = new Carta();
        Carta mesaE = new Carta();


      //la intencion es dar el valor de los sppiner a las cartas.
        jugador1A.setValor(obtenerValor(spinner0));
        //int a=jugador1A.getValor();
        //System.out.println(a);
        jugador1B.setValor(obtenerValor(spinner1));

        jugador2A.setValor(obtenerValor(spinner2));

        jugador2B.setValor(obtenerValor(spinner3));

        mesaA.setValor(obtenerValor(spinner4));

        mesaB.setValor(obtenerValor(spinner5));

        mesaC.setValor(obtenerValor(spinner6));

        mesaD.setValor(obtenerValor(spinner7));

        mesaE.setValor(obtenerValor(spinner8));

        Mesa mesa= new Mesa(mesaA,mesaB,mesaC,mesaD,mesaE);

        /*pantalla=ganador(jugador1A,jugador1B,jugador2A,jugador2B,mesa);*/
        int puntA= mesa.verMano(jugador1A,jugador1B);
        int puntB =mesa.verMano(jugador2A,jugador2B);

        if(puntA>puntB) pantalla="Gana el jugador 2";
        else if(puntA<puntB) pantalla="Gana el jugador 1";
        else pantalla="Empate";

        textViewR.setText(pantalla);
    }
    private int obtenerValor(Spinner s){
        int valor;
        String v = (String) s.getSelectedItem();
        if(v.equals("As")) valor = 14;
        else if(v.equals("K")) valor = 13;
        else if(v.equals("Q")) valor = 12;
        else if(v.equals("J")) valor = 11;
        else valor= Integer.parseInt(v);

        return valor;

    }
    /*private String ganador(Carta a, Carta b, Carta c, Carta d, Mesa m){

        Switch(valor){
            Case1:

        }

    }*/
}
