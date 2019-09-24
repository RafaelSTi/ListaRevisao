
import javax.swing.JOptionPane;


public class DiadosNamorados extends CartaoWeb {

    public DiadosNamorados(String destinatario) {
        super(destinatario);
    }

    DiadosNamorados() {
    }

   

    @Override
    public void retonarMensagem(String remetente) {
        JOptionPane.showMessageDialog(null,"Parabens "+remetente+" pelo dia dos namorados"); 
    }

   
    
}
