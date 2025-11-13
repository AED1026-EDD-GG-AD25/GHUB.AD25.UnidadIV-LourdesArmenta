package miPrincipal;

import arbolBinarioBusqueda.ArbolBinarioBusqueda;
import arbolBinarioBusqueda.BTreePrinter;
import arbolBinarioBusqueda.Entero;


public class AppOperacionesABB {
    public static void inicio(){
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
        try{
            arbol.insertar(new Entero(10));
            arbol.insertar(new Entero(15));
            arbol.insertar(new Entero(30));
            arbol.insertar(new Entero(5));
            arbol.insertar(new Entero(2));
            arbol.insertar(new Entero(1));

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        //Recorridos
        System.out.println("Recorrido Preorden:");
        arbol.preorden();
        System.out.println();
        System.out.println("Recorrido Inorden:");
        arbol.inorden();
        System.out.println();
        System.out.println("Recorrido Postorden:");
        arbol.postorden();
        ///Imprimir el arbol
        System.out.println();
        System.out.println("Vista en forma de arbol");
        System.out.println();
        BTreePrinter.printNode(arbol.getRaiz());
        System.out.println();
        try{
            arbol.insertar(new Entero(6));
            arbol.insertar(new Entero(12));
            arbol.insertar(new Entero(40));
            arbol.insertar(new Entero(50));
            arbol.insertar(new Entero(60));
            arbol.insertar(new Entero(70));
            
        }catch (Exception e) {
            System.out.println(e.getMessage());

        }
        System.out.println();
        BTreePrinter.printNode(arbol.getRaiz());
        System.out.println();

        System.out.println("Recorrido Inorden:");
        arbol.inorden();
        System.out.println();

    }
    
}
