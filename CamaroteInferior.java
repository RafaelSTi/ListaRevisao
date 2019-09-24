
package Exercicio3;

import javax.swing.JOptionPane;


public class CamaroteInferior extends VIP {
    public String localizacao;

    public CamaroteInferior() {
    }

    public CamaroteInferior(double valor) {
        super(valor);
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void ImprimirLocalizacao(String localizacao){
        JOptionPane.showMessageDialog(null, "Camarote Inferior");
    }
    
    
    
    
    }
    
    
    
    
    

