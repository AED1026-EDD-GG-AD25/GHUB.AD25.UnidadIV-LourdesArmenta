package miPrincipal;

import arbolBinarioBusqueda.CriterioEstudianteProm;
import arbolBinarioBusqueda.Estudiante;

public class AppEstudiantesCriterioPromedio {
    public static void inicio(){
        Estudiante arr[] = { new Estudiante(123,"Juan",10.0),
                             new Estudiante(124, "Pedro",6.5),
                             new Estudiante(125,"Alberto",7.3)};
        arbolBinarioBusqueda.Util.ordenar(arr, new CriterioEstudianteProm() );
        for(Estudiante e :arr){
            System.out.println(e);

        }


    }
    
}
