package arbolBinario;

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
    
    
    
}
