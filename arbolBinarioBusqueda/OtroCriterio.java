package arbolBinarioBusqueda;
import java.util.Comparator;

public class OtroCriterio  implements Comparator<Estudiante>{

    @Override
    public int compare(Estudiante o1, Estudiante o2) {
        
        return o1.getId()-o2.getId();

    }
    


    
}
