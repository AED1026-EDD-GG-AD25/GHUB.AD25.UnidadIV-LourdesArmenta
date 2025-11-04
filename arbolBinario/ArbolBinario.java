package arbolBinario;
import cola.Cola;
import pila.Pila;


public class ArbolBinario {
    //Atributo
    private Nodo raiz;

    public ArbolBinario() {
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
    
}
