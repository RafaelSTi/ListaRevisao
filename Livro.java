
package Parte2;

import javax.swing.JOptionPane;

public class Livro extends Produto{ 
    public String autor;

    public Livro(String autor) {
        this.autor = autor;
    }

    Livro() {
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void getDescriçao() {
       JOptionPane.showMessageDialog(null, autor);
    }
    
    
    
    
    
    
    
}
