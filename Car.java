
package ExercicioInterface;

import javax.swing.JOptionPane;


public class Car implements CarbonFootprint {
    
    protected String combustivel;
    protected String modelo;

    public Car(String combustivel, String modelo) {
        this.combustivel = combustivel;
        this.modelo = modelo;
    }

    Car() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void getCarbonFootprint() {
     JOptionPane.showMessageDialog(null, "carbono = quantidade total*(fator de emissao * valor de aquecimento)*densidade)*conversao");
    }

   
    
}
