
package Exercicio1;

import javax.swing.JOptionPane;

public class AssistenteTecnico extends Assistente {
    public double bonusSalario;
    

    
    public AssistenteTecnico(String nome,String sobrenome,String endereco){
        super(nome,sobrenome,endereco);
    }

    public AssistenteTecnico() {
        
    }
 
    public double getBonusSalario(){
        return bonusSalario;
    }
    public void setBonusSalario(double bonusSalario){
        this.bonusSalario = bonusSalario;
    }
    
    @Override
    public void ExibeDados(String dados,String sobrenome,String endereco){
        
        
    }

    @Override
    public void ExibeMatricula(String Matricula) {
        JOptionPane.showMessageDialog(null,Matricula);
    }
    
}
