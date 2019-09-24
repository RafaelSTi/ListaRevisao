
package Parte2;

import javax.swing.JOptionPane;


public class Mouse extends Produto {
    
    public String tipo;
    public String saida;
    public String sensibilidade;

    
    public Mouse(String tipo, String saida, String sensibilidade) {
        this.tipo = tipo;
        this.saida = saida;
        this.sensibilidade = sensibilidade;
    }

    Mouse() {
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }

    public String getSensibilidade() {
        return sensibilidade;
    }

    public void setSensibilidade(String sensibilidade) {
        this.sensibilidade = sensibilidade;
    }
    

    @Override
    public void getDescriçao() {
        JOptionPane.showMessageDialog(null, tipo);
    }
  
    
    
}
