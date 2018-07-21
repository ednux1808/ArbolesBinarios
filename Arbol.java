package estructuraNoLineales;

public class Arbol {

    NodoArbol raiz;

    Arbol() {
        raiz = null;
    }
    
    public void agregarNodo(int dato) {
        if (raiz == null) {
            raiz = new NodoArbol(dato);
        } else {
            insertar(raiz, dato);
        }
    }

    public void insertar(NodoArbol raiz, int dato) {
        if(dato > raiz.getDato()){
            if(raiz.getDer() == null){
                raiz.setDer(new NodoArbol(dato));
            }else{
                insertar(raiz.getDer(), dato);
            }
        }else if(dato < raiz.getDato()){
            if(raiz.getIzq() == null){
                raiz.setIzq(new NodoArbol(dato));
            }else{
                insertar(raiz.getIzq(), dato);
            }
        }
    }
    

    public String recorridopreOrden() {
        String cadena = "";
        cadena = preOrden(raiz, cadena);
        return cadena;
    }//fin recorridoPreorden

    public String preOrden(NodoArbol raiz, String cadena) {
        if (raiz == null) {
            return cadena;
        }

        cadena += raiz.getDato() + ",";

        cadena = preOrden(raiz.getIzq(), cadena);
        cadena = preOrden(raiz.getDer(), cadena);
        return cadena;
    }//fin PreOrden

    public String recorridoenOrden() {
        String cadena = "";
        cadena = enOrden(raiz, cadena);
        return cadena;
    }//fin recorrido enOrden

    public String enOrden(NodoArbol raiz, String cadena) {
        if (raiz == null) {
            return cadena;
        }

        cadena = enOrden(raiz.getIzq(), cadena);
        cadena += raiz.getDer() + ",";
        cadena = enOrden(raiz.getDer(), cadena);
        return cadena;
    }//fin enOrden

    public String recorridoposOrden() {
        String cadena = "";
        cadena = posOrden(raiz, cadena);
        return cadena;
    }//fin recorridopostOrden

    public String posOrden(NodoArbol raiz, String cadena) {
        if (raiz == null) {
            return cadena;
        }
        cadena = posOrden(raiz.getIzq(), cadena);
        cadena = posOrden(raiz.getDer(), cadena);
        cadena += raiz.getDato() + ",";
        return cadena;
    }//fin postOrden
}//Fin clase arbol
