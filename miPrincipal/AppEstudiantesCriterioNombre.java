package miPrincipal;

import arbolBinarioBusqueda.CriterioEstudianteNombre;
import arbolBinarioBusqueda.Estudiante;

public class AppEstudiantesCriterioNombre {
    public static void inicio(){
        
        Estudiante arr[] = { new Estudiante(123,"Juan",10.0),
                             new Estudiante(124, "Pedro",8.5),
                             new Estudiante(125,"Alberto",7.3)};
        arbolBinarioBusqueda.Util.ordenar(arr, new CriterioEstudianteNombre() );
        for(Estudiante e :arr){
            System.out.println(e);

        }

    }
    
}
