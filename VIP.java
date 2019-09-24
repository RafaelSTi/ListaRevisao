/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author ADM
 */
public abstract class VIP extends Ingresso {
    protected double addValor;

    public VIP() {
    }

    public VIP(double valor) {
        super(valor);
    }

    public double getAddValor() {
        return addValor;
    }

    public void setAddValor(double addValor) {
        this.addValor = addValor;
    }
    
    @Override
    public void ImprimiValor(double valor) {
        }
    
    public double IngressoVip (){
        
        return valor+addValor;
    }
    
}
