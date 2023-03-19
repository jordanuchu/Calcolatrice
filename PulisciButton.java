package org.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PulisciButton implements ActionListener {
    public Logica logica;

    public PulisciButton(Logica logica) {
        this.logica = logica;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        logica.getFinestra().getRisultato().setText("");
        logica.getFinestra().getNumero1().setText("");
        logica.getFinestra().getNumero2().setText("");

    }
}
