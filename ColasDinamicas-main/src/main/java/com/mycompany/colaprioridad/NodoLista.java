package com.mycompany.colaprioridad;

public class NodoLista<T> {

    String etiqueta;
    Object TObj;
    NodoLista sig;
    NodoLista ant;

    public NodoLista(String etiqueta, Object TObj) {
        this.etiqueta = etiqueta;
        this.TObj = TObj;
        this.sig = null;
        this.ant = null;
    }

    public NodoLista(String etiqueta, Object TObj, NodoLista sig, NodoLista ant) {
        this.etiqueta = etiqueta;
        this.TObj = TObj;
        this.sig = sig;
        this.ant = ant;
    }

    public NodoLista() {
    }

    @Override
    public String toString() {
        return "NodoLista{" + "etiqueta=" + etiqueta + ", TObj=" + TObj + ", sig=" + sig + ", ant=" + ant + '}';
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public Object getTObj() {
        return TObj;
    }

    public void setTObj(Object TObj) {
        this.TObj = TObj;
    }

    public NodoLista getSig() {
        return sig;
    }

    public void setSig(NodoLista sig) {
        this.sig = sig;
    }

    public NodoLista getAnt() {
        return ant;
    }

    public void setAnt(NodoLista ant) {
        this.ant = ant;
    }
}
