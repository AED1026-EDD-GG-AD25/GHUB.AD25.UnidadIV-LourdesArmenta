package cola;
public class Cola<T>{
    //atributos
    private Nodo<T> cabeza;
    private Nodo<T> cola;
    private int tamanio;
    //constructor por defecto
    public Cola(){
        cabeza = null;
        tamanio = 0;
        cola = null;
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
    public void encolar(T valor){
        //crear un nuevo Nodo
        Nodo<T> nuevo = new Nodo<>();
        //dijar el valor
        nuevo.setValor(valor);
        if (esVacia()){
            //cabeza apunto al nuevo nodo
            cabeza = nuevo;
            cola = nuevo;
        }else{
            //se enlaza al campo siguiente de cola con el nuevo
            cola.setSiguiente(nuevo);
            //la nueva cola pasa a ser nuevo
            cola = nuevo;

        }
        tamanio++;
    }
    //Elimina un elemento de la pila
    public void desencolar(){
        if (!esVacia()){
            //si hay un solo elemento en la cola
            if (cola == cabeza){
                cabeza= null;
                cola = null;
            }else //si hay mas de un elemento en la cola
            {
                //se elimina el primer elemento de la cola
                //desplazando la cabeza al siguiente nodo    
                cabeza = cabeza.getSiguiente();
            }
            tamanio--;
        }
    }
    //Devuelve un elemento almacenado en el tope de la pila
    public T frente(){
        if (!esVacia()){
            return cabeza.getValor();
        }else{
            return null;
        }

    }
    
}