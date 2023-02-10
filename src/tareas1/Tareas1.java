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
                    Auto a = new Auto();
                    a.VerAutos(as);
                } else {
                    System.out.println("no se han agregado carros");
                }
                break;

            case "2":
                if (as[0].placas != null) {
                    System.out.println("ingrese placa a eliminar");
                    String s = entrada.nextLine();
                    Auto e = new Auto();
                    Auto ncarro[] = e.EliminarAuto(s, as);
                    menu(ncarro);
                } else {
                    System.out.println("no se han agregado carros");
                }
                break;
            case "3":
                Auto M = new Auto();
                M.Matrices();
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

}
