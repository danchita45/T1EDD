//  Lista doblemente ligada
//  Cada setSig() debemos preguntar en donde queda el anterior
//  el anterior de auxiliar no se mueve
//  inserta y elimina para una lista doblemente ligada
//  recorrido de ida y vuelta con siguiente y anterior
//  muestra es recursivo
//  inserta recursivo
package com.mycompany.colaprioridad;

import java.util.HashSet;

public class Lista<T> {

    NodoLista r = null;

    public NodoLista getR() {
        return r;
    }

    public void setR(NodoLista r) {
        this.r = r;
    }

//    public String muestra() {
//        String s = " ";
//        NodoLista aux = r;
//        while (aux != null) {
//            s += aux.getEtiqueta() + "\n";
//        }
//        return s;
//    }
    
    public String muestra(String s,NodoLista lista) {
        s = "";
        NodoLista aux = lista;
        if (null != aux) {
            s += aux.getEtiqueta() + "\n";
            aux.setSig(r);
            muestra(s,aux);
        }
        return s;
    }

    public NodoLista elimina(String s) {
        if (r == null) {
            System.out.println("Lista Vacia");
            return null;
        } else {
            NodoLista n = null;
            if (r.getEtiqueta().equals(s)) {
                n = r;
                r = r.getSig();
                n.setSig(null);
                return n;
            } else {
                boolean bandera = true;
                NodoLista aux = r;
                while (aux.getSig() != null && bandera) {
                    if (aux.getSig().getEtiqueta().equals(s)) {
                        n = aux.getSig();
                        aux.setSig(n.getSig());
                        n.setSig(null);
                        bandera = false;
                    } else {
                        aux = aux.getSig();
                    }
                }
                if (bandera) {
                    System.out.println("Dato no encontrado :C");
                }
            }
        }
        return null;
    }

    public boolean inserta(NodoLista n) {
        if (n == null) {
            System.out.println("No se puede insertar");
            return false;
        } else {
            //agrega directamente
            if (r == null) {
                r = n;
                return true;
            } else {
                if (n.getEtiqueta().compareTo(r.getEtiqueta()) < 0) {
                    n.setSig(r);
                    r = n;
                    return true;
                } else {
                    boolean bandera = true;
                    NodoLista aux = r;
                    //cuando va en medio
                    while (aux.getSig() != null && bandera) {
                        if (aux.getSig().getEtiqueta().compareTo(n.getEtiqueta()) > 0) {
                            n.setSig(aux.getSig());
                            aux.setSig(n);
                            bandera = false;
                        } else {
                            aux = aux.getSig();
                        }
                    }
                    //cuando va al final
                    if (bandera) {
                        aux.setSig(n);
                    }
                }
            }
        }
        return true;
    }
}
