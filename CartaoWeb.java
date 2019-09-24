
public abstract class CartaoWeb  {
    protected String destinatario;
    protected String remetente;

    public CartaoWeb() {
    }

    public CartaoWeb(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public abstract void retonarMensagem(String remetente);
        
        
    }


