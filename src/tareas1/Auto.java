/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Danchita45
 */
public class Auto {

    public int Anio;
    public String Modelo;
    public String placas;

    public Auto(int Anio, String Modelo, String placas) {
        this.Anio = Anio;
        this.Modelo = Modelo;
        this.placas = placas;
    }

    @Override
    public String toString() {
        return "Auto{" + "Anio=" + Anio + ", Modelo=" + Modelo + ", placas=" + placas + '}';
    }

    public Auto() {
    }

    public int getAnio() {
        return Anio;
    }

    public void setAnio(int Anio) {
        this.Anio = Anio;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public static void VerAutos(Auto as[]) {
        //for(objeto en conjunto)
        for (Auto a : as) {
            System.out.println("El modelo del carro es:" + a.Modelo + "\n");
            System.out.println("Las placas son:" + a.placas + "\n");
            System.out.println("El a\u00f1o del carro es:" + String.valueOf(a.Anio) + "\n");
        }
    }

    public static Auto[] AgregarCarros(Auto as[]) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < as.length; i++) {

            Auto a = new Auto();
            System.out.println("ingrese A\u00f1o del carro");
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

    public static Auto[] EliminarAuto(String placa, Auto carros[]) {
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
        for (int[] matR1 : matR) {
            for (int j = 0; j < matR.length; j++) {
                System.out.print(" " + matR1[j]);
            }
            System.out.println(" \n");
        }
    }

}
