
import javax.swing.JOptionPane;


public class Aniversario extends CartaoWeb {
    
    
    public Aniversario (String destinatario){
        super(destinatario);
    }

    Aniversario() {
    }

   

    @Override
    public void retonarMensagem(String remetente) {
        JOptionPane.showMessageDialog(null,"Feliz Aniversario "+remetente+" !!!");
    }

   
    
}
