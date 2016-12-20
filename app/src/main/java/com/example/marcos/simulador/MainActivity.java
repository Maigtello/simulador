package com.example.marcos.simulador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import static android.R.attr.onClick;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner0,spinner1,spinner2,spinner3,spinner4,spinner5,spinner6,spinner7,spinner8;
    private Button button0;
    private TextView textView0;
    private String pantalla="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //jugador1
        spinner0 = (Spinner) findViewById(R.id.spinner0);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        //jugador2
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        //mesa
        spinner4 = (Spinner) findViewById(R.id.spinner4);
        spinner5 = (Spinner) findViewById(R.id.spinner5);
        spinner6 = (Spinner) findViewById(R.id.spinner6);
        spinner7 = (Spinner) findViewById(R.id.spinner7);
        spinner8 = (Spinner) findViewById(R.id.spinner8);

        button0 = (Button) findViewById(R.id.buttonCalcular);
        textView0 = (TextView) findViewById(R.id.textViewResult);


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
        if(comprobar(spinner0)) {
            jugador1A.setValor((String) spinner0.getSelectedItem());
        }
            else {
            jugador1A.setValor((Integer) spinner0.getSelectedItem());
        }
        if(comprobar(spinner1)) {
            jugador1B.setValor((String) spinner0.getSelectedItem());
        }
        else {
            jugador1B.setValor((Integer) spinner0.getSelectedItem());
        }
        if(comprobar(spinner2)) {
            jugador2A.setValor((String) spinner0.getSelectedItem());
        }
        else {
            jugador2A.setValor((Integer) spinner0.getSelectedItem());
        }
        if(comprobar(spinner3)) {
            jugador2B.setValor((String) spinner0.getSelectedItem());
        }
        else {
            jugador2B.setValor((Integer) spinner0.getSelectedItem());
        }
        if(comprobar(spinner4)) {
            mesaA.setValor((String) spinner0.getSelectedItem());
        }
        else {
            mesaA.setValor((Integer) spinner0.getSelectedItem());
        }
        if(comprobar(spinner5)) {
            mesaB.setValor((String) spinner0.getSelectedItem());
        }
        else {
            mesaB.setValor((Integer) spinner0.getSelectedItem());
        }
        if(comprobar(spinner6)) {
            mesaC.setValor((String) spinner0.getSelectedItem());
        }
        else {
           mesaC.setValor((Integer) spinner0.getSelectedItem());
        }
        if(comprobar(spinner7)) {
            mesaD.setValor((String) spinner0.getSelectedItem());
        }
        else {
            mesaD.setValor((Integer) spinner0.getSelectedItem());
        }
        if(comprobar(spinner8)) {
            mesaE.setValor((String) spinner0.getSelectedItem());
        }
        else {
            mesaE.setValor((Integer) spinner0.getSelectedItem());
        }
        Mesa mesa= new Mesa(mesaA,mesaB,mesaC,mesaD,mesaE);

        /*pantalla=ganador(jugador1A,jugador1B,jugador2A,jugador2B,mesa);*/

        textView0.setText(pantalla);
    }
    private boolean comprobar(Spinner s){
         return s.getSelectedItem() instanceof String;

    }
    /*private String ganador(Carta a, Carta b, Carta c, Carta d, Mesa m){

        Switch(valor){
            Case1:

        }

    }*/
}
