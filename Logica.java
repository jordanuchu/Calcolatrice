package org.example;

public class Logica {
    private Finestra finestra;
    private int count=0;
    public Logica(Finestra finestra){
        this.finestra=finestra;
    }
    protected void calcolo(){
        try{
          if(finestra.getOperazione().getSelectedItem().equals("+")) {
                count = Integer.valueOf(finestra.getNumero1().getText()).intValue() + Integer.valueOf(finestra.getNumero2().getText()).intValue();
                finestra.getRisultato().setText(String.valueOf(count));
           }

          if(finestra.getOperazione().getSelectedItem().equals("-")){

                count = Integer.valueOf(finestra.getNumero1().getText()).intValue() - Integer.valueOf(finestra.getNumero2().getText()).intValue();
                finestra.getRisultato().setText(String.valueOf(count));
           }

          if(finestra.getOperazione().getSelectedItem().equals("*")){
            count= Integer.valueOf(finestra.getNumero1().getText()).intValue()*Integer.valueOf(finestra.getNumero2().getText()).intValue();
            finestra.getRisultato().setText(String.valueOf(count) );
          }

          if(finestra.getOperazione().getSelectedItem().equals("/")){
              try {
                 count = Integer.valueOf(finestra.getNumero1().getText()).intValue() / Integer.valueOf(finestra.getNumero2().getText()).intValue();
                 finestra.getRisultato().setText(String.valueOf(count)+ " con resto:" +(Integer.valueOf(finestra.getNumero1().getText()).intValue()-(count*Integer.valueOf(finestra.getNumero2().getText()).intValue())));
                 }
              catch (ArithmeticException e){
                finestra.getRisultato().setText("impossible division by zero");
                 }
             }
        }catch (NumberFormatException e) {
             finestra.getRisultato().setText("insert only numbers");
                    }
    }
    public void init(){
        finestra.getCalcola().addActionListener(new CalcolaButton(this));
        finestra.getPulisci().addActionListener(new PulisciButton(this));
        finestra.getContinua().addActionListener(new ContinuaButton(this));
    }

    public Finestra getFinestra() {
        return finestra;
    }

    public int getCount() {
        return count;
    }
}
