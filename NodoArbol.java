package estructuraNoLineales;

public class NodoArbol {

    private int dato;
    private NodoArbol izq;
    private NodoArbol der;

    NodoArbol(int valor) {
        dato = valor;
        izq = null;
        der = null;
    }

    public NodoArbol getIzq() {
        return izq;
    }

    public void setIzq(NodoArbol izq) {
        this.izq = izq;
    }

    public NodoArbol getDer() {
        return der;
    }

    public void setDer(NodoArbol der) {
        this.der = der;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
}//fin clase NodoArbol
