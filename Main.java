
package Parte2;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[]args){
        
       String quantProdutos = JOptionPane.showInputDialog(null,"Quantos produtos pretente levar?");
       int qp = Integer.parseInt(quantProdutos);
        
        Produto[] carrinho = new Produto[qp];
        carrinho[0] = new Mouse();
        carrinho[1] = new Livro();
        
        
        
    }
}
