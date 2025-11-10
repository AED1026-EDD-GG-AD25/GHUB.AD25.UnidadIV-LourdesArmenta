package arbolBinarioBusqueda;

public class Persona implements Comparable{
    //atributos
    private int id;
    private String nombre;
    //constructor
    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    //getter y setter
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Persona [id=" + id + ", nombre=" + nombre + "]";
    }
    @Override
    public boolean esIgual(Object q) {
        Persona p = (Persona) q;
        //return (id == p.getId());
        return (nombre.compareTo(p.getNombre()) == 0);
    }
    @Override
    public boolean esMayor(Object q) {
        Persona p = (Persona) q;
        //return (id >p.getId());
        if (nombre.compareTo(p.getNombre())>0 )
            return true;
        else
            return false;
        
    }
    @Override
    public boolean esMenor(Object q) {
        Persona p = (Persona) q;
        //return (id <p.getId());
        if (nombre.compareTo(p.getNombre()) <0 )
            return true;
        else
         return false;

         


        
    }
    
    
    

    
}
