package arbolBinarioBusqueda;

public class CriterioEstudianteProm extends Criterio<Estudiante>{

    @Override
    public int comparar(Estudiante a, Estudiante b) {
        double diff = a.getPromedio()-b.getPromedio();
       // return diff>0 ? 1:diff<0 ?-1:0;
        if (diff>0)
           return 1;
        else
            if(diff<0)
               return -1;
            else
               return 0;

    }
    
    
}
