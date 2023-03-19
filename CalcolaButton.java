package org.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 public class CalcolaButton implements ActionListener {

    public Logica logica;

    public  CalcolaButton(Logica logica){
        this.logica=logica;
    }
     @Override
     public void actionPerformed(ActionEvent e) {
        logica.calcolo();

     }
 }
