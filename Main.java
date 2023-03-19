package org.example;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {

        Finestra finestra= new Finestra();
        finestra.init();
        Logica logica=new Logica(finestra);
        logica.init();
    }
}