package exercicibuscaminas;

public class Casella {
    int numero;
    boolean mina;
    int cercaMina;
    
    public Casella(int numero, boolean mina, int cercaMina) {
        this.numero = numero;
        this.mina = mina;
        this.cercaMina = cercaMina;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isMina() {
        return mina;
    }

    public void setMina(boolean mina) {
        this.mina = mina;
    }

    public int getCercaMina() {
        return cercaMina;
    }

    public void setCercaMina(int cercaMina) {
        this.cercaMina = cercaMina;
    }

    @Override
    public String toString() {
        return "Casella{Mina="+ mina + '}';
    }
    
    
}
