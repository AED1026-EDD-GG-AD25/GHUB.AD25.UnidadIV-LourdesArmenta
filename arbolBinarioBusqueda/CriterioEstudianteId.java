package arbolBinarioBusqueda;

public class CriterioEstudianteId extends Criterio<Estudiante>{

    @Override
    public int comparar(Estudiante a, Estudiante b) {
        
        if (a.getId()<b.getId())
           return -1;
        else if (a.getId()>b.getId())
            return 1;
        else
            return 0;
    }
    
    
}
