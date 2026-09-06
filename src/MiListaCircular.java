public class MiListaCircular {
    private class Nodo {
        int dato;
        Nodo siguiente;

        public Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo cabeza = null;
    private Nodo cola = null;
    private int tamaño = 0;

    public void agregar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            nuevoNodo.siguiente = cabeza;
        } else {
            cola.siguiente = nuevoNodo;
            cola = nuevoNodo;
            cola.siguiente = cabeza;
        }
        tamaño++;
    }
}