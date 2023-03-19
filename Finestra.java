package org.example;
import net.miginfocom.swing.MigLayout;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class Finestra extends JFrame {

    private MigLayout layout = new MigLayout("wrap 2","[]50[]","[]10[]10[]");
    private JPanel panel= new JPanel(layout);
    private  JTextField numero1 = new JTextField(20);
    private JTextField risultato = new JTextField(20);
    private JTextField numero2 = new JTextField(20);
    private JButton pulisci=new JButton( "   pulisci  ");
    private JButton calcola=new JButton( "  calcola  ");
    private JButton continua=new JButton(" continua ");
    private JComboBox operazione=new JComboBox();

    public Finestra(){

        this.setTitle("Calcolatrice");
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);

    }
    public void init(){
        panel.add(numero1);
        panel.add(calcola);
        panel.add(numero2);
        panel.add(pulisci);
        operazione.addItem("+");
        operazione.addItem("-");
        operazione.addItem("*");
        operazione.addItem("/");
        panel.add(operazione);
        panel.add(continua);
        risultato.setEditable(false);
        panel.add(risultato);
        this.setContentPane(panel);
        this.setVisible(true);


    }

    public JTextField getRisultato() {
        return risultato;
    }

    public JComboBox getOperazione() {
        return operazione;
    }

    public JTextField getNumero1() {
        return numero1;
    }

    public JTextField getNumero2() {
        return numero2;
    }

    public JButton getPulisci() {
        return pulisci;
    }

    public JButton getCalcola() {
        return calcola;
    }

    public JButton getContinua() {
        return continua;
    }
}
