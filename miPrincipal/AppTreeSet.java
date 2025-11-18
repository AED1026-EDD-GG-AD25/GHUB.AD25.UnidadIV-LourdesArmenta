package miPrincipal;
import java.util.TreeSet;



import java.util.Iterator;


public class AppTreeSet {
    public static void inicio(){
        TreeSet<Integer> t = new TreeSet<>();
        t.add(10);
        t.add(15);
        t.add(30);
        t.add(5);
        t.add(2);
        t.add(1);
        t.add(4);
        t.add(20);
        //Recorrer el arbol utilizando iteradores
        for(Iterator<Integer> it= t.iterator();it.hasNext();){
            System.out.print(it.next()+" ");

        }
        System.out.println();
        System.out.println("Se encuentra el elemento 30?"+t.contains(30));
        System.out.println("Se encuentra el elemento 40?"+t.contains(40));
        System.out.println("Tamaño del arbol:"+t.size());
        System.out.println(t.first());
        t.remove(10);
        System.out.println("Elementos del arbol, despues de remover 10");
        for(Iterator<Integer> it= t.iterator();it.hasNext();){
            System.out.print(it.next()+" ");

        }
        System.out.println();
        System.out.println(t.first());
        

        
        

        

    }
    
}
