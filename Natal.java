
import javax.swing.JOptionPane;


public class Natal extends CartaoWeb {

    public Natal(String destinatario) {
        super(destinatario);
    }

    Natal() {
    }

    @Override
    public void retonarMensagem(String remetente) {
        JOptionPane.showMessageDialog(null,"Feliz natal "+remetente+" !!!"); 
    }

   
    
}
