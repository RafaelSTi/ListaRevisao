

package ExercicioInterface;

import javax.swing.JOptionPane;

public abstract class Building implements CarbonFootprint {
    protected int numPessoa;
    protected boolean energiaRetornavel;
    protected int numLampada;
    protected boolean arCondicionado;
    protected int carbono;

    public Building(int numPessoa, boolean energiaRetornavel, int numLampada, boolean arCondicionado) {
        this.numPessoa = numPessoa;
        this.energiaRetornavel = energiaRetornavel;
        this.numLampada = numLampada;
        this.arCondicionado = arCondicionado;
    }

    Building() {
       
    }

    public int getNumPessoa() {
        return numPessoa;
    }

    public void setNumPessoa(int numPessoa) {
        this.numPessoa = numPessoa;
    }

    public boolean isEnergiaRetornavel() {
        return energiaRetornavel;
    }

    public void setEnergiaRetornavel(boolean energiaRetornavel) {
        this.energiaRetornavel = energiaRetornavel;
    }

    public int getNumLampada() {
        return numLampada;
    }

    public void setNumLampada(int numLampada) {
        this.numLampada = numLampada;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    @Override
    public void getCarbonFootprint() {
        JOptionPane.showMessageDialog(null,"carbono = quantidade total*(fator de emissao * valor de aquecimento)*densidade");
    }
    


}