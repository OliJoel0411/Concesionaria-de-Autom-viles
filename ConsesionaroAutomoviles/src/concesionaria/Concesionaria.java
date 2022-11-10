package concesionaria;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 *
 * @author oliver
 */
public class Concesionaria {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int num = 0;
        menu();
    }

    public static void menu(){
        System.out.println("---------------------------------------------------");
        System.out.println("---------------CONSESIONARIA DE AUTOS--------------");
        System.out.println("                  -MENU PRINCIPAL-");
        System.out.println("---------------------------------------------------");
        System.out.println();
        System.out.println("1. Seleccionar Automovil");
        System.out.println("2. Salir");
        System.out.println();
    }
}
