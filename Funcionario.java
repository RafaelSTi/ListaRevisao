
package Exercicio1;

public abstract class Funcionario {
    protected String nome;
    protected String endereco;
    protected String sobrenome;

    public Funcionario() {
    }

    public Funcionario(String nome, String endereco, String sobrenome) {
        this.nome = nome;
        this.endereco = endereco;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    
    public abstract void ExibeDados(String nome,String sobrenome,String endereco);
    
    
}
