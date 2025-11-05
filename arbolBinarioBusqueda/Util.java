package arbolBinarioBusqueda;
import java.lang.Comparable;


public class Util {
    //ordenamiento por método de la burbuja
    public static void ordenar(Comparable arr[]){
        if(arr==null || arr.length<2)
            return;
        //Arrays.sort(arr);
        boolean ordenado = false;
        while(!ordenado){
            ordenado = true;
            for(int i=0;i<arr.length-1;i++){
                if(arr[i+1].compareTo(arr[i])<0){
                    Comparable aux = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=aux;
                    ordenado = false;
                }
            }
        }
    }

    public static void ordenar(Object arr[],Criterio cr){
        if(arr==null || arr.length<2)
            return;
        //Arrays.sort(arr);
        boolean ordenado = false;
        while(!ordenado){
            ordenado = true;
            for(int i=0;i<arr.length-1;i++){
                //Ahora la decision sobre quien procede a quien
                if(cr.comparar(arr[i+1],arr[i])<0)
                 {
                    Object aux = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = aux;
                    ordenado = false;
                 }
                    
            }
        }
    }
    
}
