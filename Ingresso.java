
package Exercicio3;

public abstract class Ingresso {
    protected double valor;

    public Ingresso() {
    }

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public abstract void ImprimiValor(double valor);
    
}
