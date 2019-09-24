
package Exercicio4;

import javax.swing.JOptionPane;

public class Velho extends Imovel {
    public double desconto;

    public Velho(String endereco, double preco) {
        super(endereco, preco);
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    public void ImprimirDesconto(double desconto){
        JOptionPane.showMessageDialog(null, desconto);
    }
}
