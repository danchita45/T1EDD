package com.mycompany.colaprioridad;

import EDD.Machote;

public class ColaCircularDinamica<T> implements Machote {

    int atras = -1;
    Elefante[] cd =null;
    public static Elefante elef = new Elefante();
    
    @Override
    public boolean vacio() {
        return (atras == -1);
    }

    @Override
    public boolean llena() {
        return false;
    }

    @Override
    public boolean inserta(Object obj) {
        if (vacio()) {
            cd = new Elefante[1];
            cd[0] = (Elefante) obj;
            atras++;
            return true;
        } else {
            atras++;
            Elefante[] cde = new Elefante[atras + 1];
            cde[atras] = (Elefante) obj;
            int i = 0;
            for (Elefante f : cd) {
                cde[i] = f;
                i++;
            }
            cd = new Elefante[cde.length];
            System.arraycopy(cde, 0, cd, 0, cde.length);
            return true;
        }
    }

    @Override
    public Object elimina() {
        if (!vacio()) {
            Elefante elefante = cd[0];
            Elefante[] olifante = new Elefante[cd.length - 1];
            System.arraycopy(cd, atras+1, olifante, 0, cd.length - 1);
            cd = new Elefante[olifante.length];
            System.arraycopy(olifante, 0, cd, 0, olifante.length);
            atras++;
            return elefante;
        } else {
            Elefante fante= new Elefante();
            System.out.println("Cola vacia!!!...");
            return fante;
        }
    }
}
