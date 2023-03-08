package com.mycompany.colaprioridad;

import java.util.Scanner;

public class ColaPrioridad {

    public static ColasDinamicas Cola = new ColasDinamicas();
    public static PilasD Pila = new PilasD();
    public static ColaCircularDinamica ColaCircular = new ColaCircularDinamica();
    public static Lista Listaa = new Lista();
    
    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("1: ColasDinamicas");
        System.out.println("2: PilasDinamicas");
        System.out.println("3: ColaCircularDinamica");
        System.out.println("4: Lista");
        System.out.println("5: Salir");
        String var = teclado.nextLine();
        switch (var) {
            case "1":
                menuCD();
                break;
            case "2":
                menuPD();
            case "3":
                menuCCD();
            case "4":
                lista();
            case "5":
                System.exit(0);
            default:
                throw new AssertionError();
        }
    }

    public static void menuCD() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("1: Inserta");
        System.out.println("2: Elimina");
        System.out.println("3: Muestra");
        System.out.println("4: Salir al menu principal");
        String var = teclado.nextLine();

        switch (var) {
            case "1":
                Elefante elefante = new Elefante();
                System.out.println("ingrese etiqueta elefante");
                elefante.etiqueta = teclado.nextLine();
                Cola.inserta(elefante);
                menuCD();
                break;
            case "2":
                Elefante elefant = (Elefante) Cola.elimina();
                System.out.println(elefant.etiqueta);
                menuCD();
                break;
            case "3":
                if (Cola.vacio()) {
                    System.out.println("Cola vacia, agrega elementos");
                } else {
                    for (int i = 0; i < Cola.cd.length; i++) {
                        if (Cola.cd[i] != null) {
                            System.out.println(Cola.cd[i].etiqueta);
                        }
                    }
                }
                menuCD();
            case "4":
                menuPrincipal();
            default:
                System.out.println("Opcion NO valida");
                menuCD();
        }
    }

    private static void lista() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("1: Inserta");
        System.out.println("2: Elimina");
        System.out.println("3: Muestra");
        System.out.println("4: Salir al menu principal");
        String var = teclado.nextLine();
        switch (var) {
            case "1":
                Auto b = new Auto();
                Auto autoC = new Auto("C", 1956, 1, "C");
                NodoLista ln = new NodoLista(autoC.getMatricula(),autoC);
                Listaa.inserta(ln);
                lista();
                break;
            case "2":
                Auto a = new Auto();
                lista();
                break;
            case "3":
                Auto c = new Auto();
                lista();
                break;
            case "4":
                Auto d = new Auto();
                menuPrincipal();
                break;
            default:
                System.out.println("Opcion no valida");
                lista();
                break;
        }
    }

    private static void menuPD() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("1: Inserta");
        System.out.println("2: Elimina");
        System.out.println("3: Muestra");
        System.out.println("4: Salir al menu principal");
        String var = teclado.nextLine();

        switch (var) {
            case "1":
                Elefante elefante = new Elefante();
                System.out.println("ingrese etiqueta elefante");
                elefante.etiqueta = teclado.nextLine();
                Pila.inserta(elefante);
                menuPD();
                break;
            case "2":
                Elefante elefant = (Elefante) Pila.elimina();
                System.out.println(elefant.etiqueta);
                menuPD();
                break;
            case "3":
                System.out.println(Pila.cd[Pila.Tope].etiqueta);
                menuPD();
                break;
            case "4":
                menuPrincipal();
                break;
            default:
                System.out.println("Opcion no valida");
                menuPD();
                break;
        }

    }

    private static void menuCCD() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("1: Inserta");
        System.out.println("2: Elimina");
        System.out.println("3: Muestra");
        System.out.println("4: Salir al menu principal");
        String var = teclado.nextLine();
        switch (var) {
            case "2":
                Elefante elefant = (Elefante) ColaCircular.elimina();
                System.out.println(elefant.etiqueta);
                menuCCD();
                break;
            case "4":
                menuPrincipal();
            default:
                throw new AssertionError();
        }
    }
}
