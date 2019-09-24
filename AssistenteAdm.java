
package Exercicio1;

import javax.swing.JOptionPane;


public class AssistenteAdm extends Assistente{
    public String turno;
    public double addNoturno;
    
    
    public AssistenteAdm() {
        
    }
    
    public AssistenteAdm (String nome,String sobrenome,String endereco){
        super(nome,sobrenome,endereco);
    }
    
    public String getTurno(){
        return turno;
    }
    public void setTurno(String turno){
        this.turno = turno;
    }

    public double getAddNoturno() {
        return addNoturno;
    }

    public void setAddNoturno(double addNoturno) {
        this.addNoturno = addNoturno;
    }

    @Override
    public void ExibeDados(String nome, String sobrenome, String endereco) {
        
    }

   
    @Override
    public void ExibeMatricula(String Matricula) {
         JOptionPane.showMessageDialog(null,Matricula);
    }

     
}

