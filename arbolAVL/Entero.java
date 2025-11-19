package arbolAVL;

public class Entero implements Comparable{
    //atributos
    private int dato;
    //constructores

    public Entero() {
        this.dato = 0;
    }

    public Entero(int dato) {
        this.dato = dato;
    }
    //getter y setter
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return ""+dato ;
    }

    @Override
    public boolean esIgual(Object q) {
        Entero obj = (Entero) q;
        boolean valor;
        valor = dato == obj.getDato();
        return valor;

    }

    @Override
    public boolean esMayor(Object q) {
        Entero obj = (Entero) q;
        boolean valor;
        valor = dato > obj.getDato();
        return valor;
    }
        

    @Override
    public boolean esMenor(Object q) {
        Entero obj = (Entero) q;
        boolean valor;
        valor = dato < obj.getDato();
        return valor;
        
    }
    
    
    
    
    


    
}
