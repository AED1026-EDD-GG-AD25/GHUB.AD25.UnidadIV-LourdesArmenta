package miPrincipal;
import arbolBinarioBusqueda.Persona;

public class AppPersonaComparable {
    public static void inicio(){
        Persona p1 = new Persona(123,"Ana Juarez");
        Persona p2 = new Persona(125,"Ana Armenta");
        if(p1.esMayor(p2)){
            System.out.println(p1.getNombre()+" es mayor que "+p2.getNombre());
        }else if (p1.esMenor(p2)){
            System.out.println(p1.getNombre()+" es menor que "+p2.getNombre());
        }else{
            System.out.println(p1.getNombre()+" es igual "+p2.getNombre());
        }

        p1 = new Persona(123,"Beto Cueva");
        p2 = new Persona(125,"Zulema Hernandez");
        if(p1.esMayor(p2)){
            System.out.println(p1.getNombre()+" es mayor que "+p2.getNombre());
        }else if (p1.esMenor(p2)){
            System.out.println(p1.getNombre()+" es menor que "+p2.getNombre());
        }else{
            System.out.println(p1.getNombre()+" es igual "+p2.getNombre());
        }

        p1 = new Persona(123,"Zulema Hernandez");
        p2 = new Persona(125,"Zulema Hernandez");
        if(p1.esMayor(p2)){
            System.out.println(p1.getNombre()+" es mayor que "+p2.getNombre());
        }else if (p1.esMenor(p2)){
            System.out.println(p1.getNombre()+" es menor que "+p2.getNombre());
        }else{
            System.out.println(p1.getNombre()+" es igual "+p2.getNombre());
        }


        

    }
    
}
