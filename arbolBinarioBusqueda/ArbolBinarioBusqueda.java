package arbolBinarioBusqueda;

import cola.Cola;
import pila.Pila;

public class ArbolBinarioBusqueda {
    //Atributo
    private Nodo raiz;
    
    public ArbolBinarioBusqueda() {
        raiz = null;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    //Recorridos recursivos
    private void visitar(Nodo aux){
        System.out.print(aux.getValor()+" ");
    }

    /*
     * preorden (RID)
     */
    public void preorden(){
        preorden(raiz);
    }
    private void preorden(Nodo aux){
        if (aux != null){
            visitar(aux);
            preorden(aux.getIzquierdo());
            preorden(aux.getDerecho());

        }
    }
    /*
     * Inorden (IRD)
     */
    public void inorden(){
        inorden(raiz);
    }
    private void inorden(Nodo aux){
        if(aux != null){
            inorden(aux.getIzquierdo());
            visitar(aux);
            inorden(aux.getDerecho());

        }
    }
    /*
     * postorden (IDR)
     */
    public void postorden(){
        postorden(raiz);
    }
    private void postorden(Nodo aux){
        if(aux!=null){
            postorden(aux.getIzquierdo());
            postorden(aux.getDerecho());
            visitar(aux);
        }
    }
    /*
     * Recorrido por niveles utilizando una cola
     */
    public void recorridoPorNivelnes(){
        Cola<Nodo> cola = new Cola<Nodo>();
        cola.encolar(raiz);
        while (!cola.esVacia()){
            Nodo aux = cola.frente();
            visitar(aux);
            if(aux.getIzquierdo()!=null){
                cola.encolar(aux.getIzquierdo());
            }
            if(aux.getDerecho()!=null){
                cola.encolar(aux.getDerecho());
            }
            cola.desencolar();
        }
    }
    /*
     * Recorrido preorden de forma iterativa utilizando una pila
     */
    public void preordenIterativo(){
        Pila<Nodo> pila = new Pila<Nodo>();
        pila.apilar(raiz);
        while (!pila.esVacia()){
            Nodo aux = pila.cima();
            visitar(aux);
            pila.retirar();
            if(aux.getDerecho()!=null){
                pila.apilar(aux.getDerecho());
            }
            if(aux.getIzquierdo()!=null){
                pila.apilar(aux.getIzquierdo());
            }
        }
    }
    /*
     * Recorrido inorden iterativo utilizando una pila
     */
    public void inordenIterativo(){
        Pila<Nodo> pila = new Pila<>();
        pila.apilar(raiz);
        Nodo aux = raiz.getIzquierdo();
        while (aux != null || !pila.esVacia()){
            if (aux != null){
                pila.apilar(aux);
                aux = aux.getIzquierdo();
            }else{
                aux = pila.cima();
                pila.retirar();
                visitar(aux);
                aux = aux.getDerecho();
            }
        }


    }
    /*
     * Recorrido postorden iterativo
     */
    public void postordenIterativo(){
        Pila<Nodo> pila = new Pila<Nodo>();
        Nodo aux = raiz;
        Nodo q = raiz;
        while (aux !=null){
            //avanza por izquierda ya apila los nodos
            while(aux.getIzquierdo() !=null){
                pila.apilar(aux);
                aux = aux.getIzquierdo();
            }
            //ahora voy por la derecha
            while (aux !=null && (aux.getDerecho() == null || aux.getDerecho()==q)){
                visitar(aux);
                q = aux;
                if (pila.esVacia()){
                    return;
                }
                aux = pila.cima();
                pila.retirar();
            }
            pila.apilar(aux);
            aux = aux.getDerecho();
        }
    }
    /*
     * Inserta iterativa un nodo en el arbol binario
     */
    public void insertar(Object valor) throws Exception{
        Comparable dato = (Comparable) valor;
        Nodo nuevo = new Nodo();
        nuevo.setValor(dato);
        if(raiz==null){
            raiz = nuevo;

        }else{
            //anterior: referencia al padre de aux
            Nodo anterior = null;
            //aux: quxiliar que va recorriendo los nodos, desde la rai<
            Nodo aux = raiz;
            while (aux != null){
                anterior = aux;
                if (dato.esMenor(aux.getValor()))
                   aux = aux.getIzquierdo();
                else if(dato.esMayor(aux.getValor()))
                   aux = aux.getDerecho();
                else
                  throw new Exception("Dato Duplicado");
            }
            if(dato.esMenor(anterior.getValor()))
                anterior.setIzquierdo(nuevo);
            else
               anterior.setDerecho(nuevo);

        }
    }
    /*
     * Búsqueda iterativa
     */
    public Nodo buscar(Object valor){
        Comparable dato = (Comparable)valor;
        if (raiz == null){
            return raiz;
        }else{
            //aux: auxiliar que va recorriendo los nodos desde la raiz
            Nodo aux = raiz;
            while (aux!=null){
                if(dato.esIgual(aux.getValor()))
                    return aux;
                if(dato.esMenor(aux.getValor()))
                    aux = aux.getIzquierdo();
                else
                    aux = aux.getDerecho();
            }
            return null;
        }
    }
    /*
     * Interfaz de buscar que invoca al metodo recursivo: localizar
     */
    public Nodo buscar2(Object valor){
        Comparable dato = (Comparable)valor;
        if(raiz == null)
          return null;
        else
          return localizar(raiz,dato);
    }
    //Funcion Recursiva
    public Nodo localizar(Nodo raizSub, Comparable buscado){
        if (raizSub==null)
           return null;
        else if(buscado.esIgual(raizSub.getValor()))
            return raizSub;
        else if(buscado.esMenor(raizSub.getValor()))
            return localizar(raizSub.getIzquierdo(), buscado);
        else
            return localizar(raizSub.getDerecho(), buscado);
    }
    /*
     * Eliminar en un arbol de búsqueda
     */
    
               
    public boolean eliminar(Object valor){
        Comparable dato = (Comparable) valor;
        //Buscar el nodo a elimininar y su antecesor
        Nodo antecesor = null;
        Nodo aux = raiz;
        while(aux !=null){
            if(dato.esIgual(aux.getValor())){
               break;
            }
            antecesor = aux;
            if(dato.esMenor(aux.getValor()))
               aux = aux.getIzquierdo();
            else
               aux = aux.getDerecho();
        }
        if(aux == null)
           return false;
        //si llego a este punto, el nodo a eliminar existe y se encuentra en aux y su
        //su padre es antecesor
        //Examinar cada caso
        //1. Si tiene menos de dos hijos, incluso una hoja, reajustar 
        //   lo enlaces de antecesor
        if (aux.getIzquierdo()==null)
           if (aux.getValor().esMenor(antecesor.getValor()))
              antecesor.setIzquierdo(aux.getDerecho());
           else
              antecesor.setDerecho(aux.getDerecho());
           else if(aux.getDerecho()==null)
              if(aux.getValor().esMenor(antecesor.getValor()))
                  antecesor.setIzquierdo(aux.getIzquierdo());
              else
                  antecesor.setDerecho(aux.getIzquierdo());
        else 
            //el nodo a eliminar tiene ra,a izquierda u derecha
            //caso 2.
            reemplazarPorMayorIzquierdo(aux);
            aux = null;
            return true;

    }
    /*
     * Reemplaza el nodo actual, por el mayor de la rama izquierda
     * @param act : nodo actual o nodo a eliminar que tiene rama izquiera y rama derecha 
     */
    private void reemplazarPorMayorIzquierdo(Nodo act){

    }

    
}
