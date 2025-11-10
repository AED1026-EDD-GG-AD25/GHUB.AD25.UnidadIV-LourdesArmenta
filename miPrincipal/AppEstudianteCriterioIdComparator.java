package miPrincipal;

import arbolBinarioBusqueda.OtroCriterio;
import arbolBinarioBusqueda.Estudiante;

public class AppEstudianteCriterioIdComparator {
    public static void inicio() {
         Estudiante arr[] = { new Estudiante(125,"Juan",10.0),
                             new Estudiante(124, "Pedro",8.5),
                             new Estudiante(121,"Alberto",7.3)};
        arbolBinarioBusqueda.Util.ordenar(arr, new OtroCriterio() );
        for(Estudiante e :arr){
            System.out.println(e);

        }
        
    }
    
}
