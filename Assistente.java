
package Exercicio1;


public abstract class Assistente extends Funcionario{
    public String Matricula;

    public Assistente() {
    }

    public Assistente(String nome, String endereco, String sobrenome) {
        super(nome, endereco, sobrenome);
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }
   
    @Override
    public abstract void ExibeDados(String nome, String sobrenome, String endereco);
       
    
    public abstract void ExibeMatricula(String Matricula);
    
    
    
}
