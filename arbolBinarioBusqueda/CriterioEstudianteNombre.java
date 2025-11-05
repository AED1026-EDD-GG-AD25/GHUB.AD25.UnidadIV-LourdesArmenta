package arbolBinarioBusqueda;

public class CriterioEstudianteNombre extends Criterio<Estudiante>{

    @Override
    public int comparar(Estudiante a, Estudiante b) {
        
        return (a.getNombre().compareTo(b.getNombre()));
    }

    
}
