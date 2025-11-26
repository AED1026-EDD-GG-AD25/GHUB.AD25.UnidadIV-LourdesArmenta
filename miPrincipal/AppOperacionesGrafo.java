package miPrincipal;
import grafo.*;


public class AppOperacionesGrafo {
    //Este programa muestra como utilizar la clase GrafoMatriz
    public static void inicio(){
        GrafoMatriz grafo = new GrafoMatriz(5);
        grafo.nuevoVertice("D");
        grafo.nuevoVertice("F");
        grafo.nuevoVertice("K");
        grafo.nuevoVertice("L");
        grafo.nuevoVertice("R");
        try{
            grafo.nuevoArco("D","F");
            grafo.nuevoArco("D","K");
            grafo.nuevoArco("F","D");
            //grafo.nuevoArco("D","f");//error
            grafo.nuevoArco("L","K");
            grafo.nuevoArco("L","F");
            grafo.nuevoArco("R","D");

            System.out.println("Es el Vertice D es adyacente de F ?"+grafo.adyacente("D","F"));
            System.out.println("Es el Vertice F es adyacente de D ?"+grafo.adyacente("F","D"));

            System.out.println("Es el Vertice R es adyacente de F ?"+grafo.adyacente("R","F"));

            System.out.println("Vertices del grafo: ");
            System.out.println(grafo.imprimirVertices());

            System.out.println("Matriz de Adyacencia del grafo: ");
            System.out.println(grafo.imprimirMatriz());

            int [][] matriz;
            matriz = grafo.getMatriz();
            for(int i=0;i<matriz.length;i++){
                for (int j=0;j<matriz[i].length;j++){
                    System.out.print(matriz[i][j]+" ");
                }
                System.out.println();
            }







        }catch(Exception e){
            System.out.println("Error : "+e.getMessage());
        }

        
    }
    
}
