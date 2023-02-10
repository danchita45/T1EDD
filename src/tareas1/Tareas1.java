/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas1;

import java.sql.Types;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Danchita45
 */
public class Tareas1 extends Auto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese numero de carros");
        String nombre = entrada.nextLine();
        int cantidad = Integer.parseInt(nombre);
        Auto as[] = new Auto[cantidad];
        Auto[] carro = AgregarCarros(as);
        as = menu(carro);
    }

    public static Auto[] menu(Auto as[]) {
        Auto carro[] = as;
        Scanner entrada = new Scanner(System.in);
        System.out.println("seleccione una opcion\n");
        System.out.println("1: ver Autos\n");
        System.out.println("2: eliminar Autos\n");
        System.out.println("3: hacer matriz\n");
        System.out.println("4: salir\n");
        String opc = entrada.nextLine();

        switch (opc) {

            case "1":
                if (as[0].placas != null) {
                    VerAutos(as);
                } else {
                    System.out.println("no se han agregado carros");
                }
                break;
                
            case "2":
                if (as[0].placas != null) {
                    System.out.println("ingrese placa a eliminar");
                    String s = entrada.nextLine();
                    Auto ncarro[] = EliminarAuto(s, as);
                    menu(ncarro);
                } else {
                    System.out.println("no se han agregado carros");
                }
                break;
            case "3":
                Matrices();
                break;
            case "4":
                System.exit(0);
                break;
            default:
                System.out.println("La opcion no existe");
                break;

        }
        menu(carro);
        return carro;
    }

    public static void VerAutos(Auto as[]) {
        for (Auto a : as) {
            System.out.println("El modelo del carro es:" + a.Modelo + "\n");
            System.out.println("Las placas son:" + a.placas + "\n");
            System.out.println("El año del carro es:" + String.valueOf(a.Anio) + "\n");
        }
    }

    public static Auto[] AgregarCarros(Auto as[]) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < as.length; i++) {

            Auto a = new Auto();
            System.out.println("ingrese Año del carro");
            String anio = entrada.nextLine();
            a.Anio = Integer.parseInt(anio);

            System.out.println("ingrese Modelo(nombre) del carro");
            String Model = entrada.nextLine();
            a.Modelo = Model;

            System.out.println("ingrese Placas del carro");
            String Placa = entrada.nextLine();
            a.placas = Placa;

            as[i] = a;
            System.out.println("se ha agregado el auto\n");
        }
        return as;
    }

    private static Auto[] EliminarAuto(String placa, Auto carros[]) {
        Auto ut[] = new Auto[carros.length - 1];

        for (int i = 0; i < carros.length; i++) {
            String valor = carros[i].placas;
            if (i < ut.length) {
                if (!valor.equals(placa)) {
                    Auto nuevo = new Auto();
                    nuevo.Anio = carros[i].Anio;
                    nuevo.Modelo = carros[i].Modelo;
                    nuevo.placas = carros[i].placas;
                    ut[i] = nuevo;
                }
            } else {
                if (!valor.equals(placa)) {
                    Auto nuevo = new Auto();
                    nuevo.Anio = carros[i].Anio;
                    nuevo.Modelo = carros[i].Modelo;
                    nuevo.placas = carros[i].placas;
                    ut[i - 1] = nuevo;
                }
            }

        }
        return ut;
    }
    
    
    public static void Matrices(){
        Random random = new Random();
        int matR[][] = new int[3][3];
        for (int i = 0; i < matR.length; i++) {
            for (int j = 0; j < matR.length; j++) {
                matR[i][j] = random.nextInt() + random.nextInt();
                System.out.println("Columna: " + i + " Fila: " + j + "\n");
                System.out.println("Valor: " + matR[i][j]);
            }
        }
        System.out.println("==============================================");
        for (int i = 0; i < matR.length; i++) {
            for (int j = 0; j < matR.length; j++) {
                System.out.print(" "+matR[i][j]);
            }
            System.out.println(" \n");
        }
    }

}
