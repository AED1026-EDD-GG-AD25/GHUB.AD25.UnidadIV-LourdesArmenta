package pila;
public class Pila<T>{
    //atributos
    private Nodo<T> cabeza;
    private int tamanio;
    //constructor por defecto
    public Pila(){
        cabeza = null;
        tamanio = 0;
    }
    //getter y setter
    public int getTamanio() {
        return tamanio;
    }
    //métodos personalizados
    public boolean esVacia(){
        /*/
        if (cabeza == null){
            return true;
        }else{
            return false;
        }
            */

        return (cabeza==null);


    }
    public void apilar(T valor){
        //crear un nuevo Nodo
        Nodo<T> nuevo = new Nodo<>();
        //dijar el valor
        nuevo.setValor(valor);
        if (esVacia()){
            //cabeza apunto al nuevo nodo
            cabeza = nuevo;
        }else{
            //se enlaza al campo siguiente de nueva cabeza
            nuevo.setSiguiente(cabeza);
            //la nueva cabeza de la pila pasa a ser nuevo
            cabeza = nuevo;

        }
        tamanio++;
    }
    //Elimina un elemento de la pila
    public void retirar(){
        if (!esVacia()){
            cabeza = cabeza.getSiguiente();
            tamanio--;
        }
    }
    //Devuelve un elemento almacenado en el tope de la pila
    public T cima(){
        if (!esVacia()){
            return cabeza.getValor();
        }else{
            return null;
        }

    }
    
}