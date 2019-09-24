package Parte2;

import javax.swing.JOptionPane;

public abstract class Produto {
    protected String nomeLoja;
    protected double preço;
    protected String descriçao;

    public Produto() {
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public abstract void getDescriçao();

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }
    
    
    
}
