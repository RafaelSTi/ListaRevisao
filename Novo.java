
package Exercicio4;

import javax.swing.JOptionPane;


public class Novo extends Imovel{
    
    public double valorAdd;

    public Novo(String endereco, double preco) {
        super(endereco, preco);
    }

    public double getValorAdd() {
        return valorAdd;
    }

    public void setValorAdd(double valorAdd) {
        this.valorAdd = valorAdd;
    }
    
    public void ImprimirValor(double valorAdd){
      JOptionPane.showMessageDialog(null, valorAdd);
    }
    
}
