
package Exercicio3;

import javax.swing.JOptionPane;


public class Normal extends Ingresso {

    public Normal() {
    }

    public Normal(double valor) {
        super(valor);
    }

    
    @Override
    public void ImprimiValor(double valor) {
    JOptionPane.showMessageDialog(null, "Ingresso Normal");
    }
    
}
