
package Exercicio3;


public class CamaroteSuperior extends VIP {
    public double valorAdd;

    public CamaroteSuperior() {
    }

    public CamaroteSuperior(double valor) {
        super(valor);
    }

    public double getValorAdd() {
        return valorAdd;
    }

    public void setValorAdd(double valorAdd) {
        this.valorAdd = valorAdd;
    }
    
    public double ValorCamaroteSup(){
        return valor+valorAdd;
    }
    
}
