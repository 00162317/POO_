package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static herramientasMinecraft hacha = new herramientasMinecraft();
    public static herramientasMinecraft pico = new herramientasMinecraft();
    public static herramientasMinecraft espada = new herramientasMinecraft();
    public static herramientasMinecraft pala = new herramientasMinecraft();
    public static herramientasMinecraft hoz = new herramientasMinecraft();
    public static ArrayList<herramientasMinecraft> lista = new ArrayList<>();

    public static void Menu(){
        System.out.println("-----------------------------------------");
        System.out.println("1. Agregar Herramientas a la lista");
        System.out.println("2. Consultar las herramientas ");
        System.out.println("3. Consultar herramientas de un tipo");
        System.out.println("4. Accion del metodo 1 (Atacar)");
        System.out.println("5. Accion del metodo 2 (Defender)");
        System.out.println("6. Salir");
        System.out.println("-----------------------------------------");
    }
    public static void menu2(){
        Scanner palabra2 = new Scanner(System.in);
        boolean salir = false;
        while (!salir){
            System.out.println("-----------------------------------------");
            System.out.println("1.Hacha");
            System.out.println("2.Pico");
            System.out.println("3.Espada");
            System.out.println("4.Pala");
            System.out.println("5.Hoz");
            System.out.println("6. SALIR");
            System.out.println("-----------------------------------------");
            try {
                int respuesta = palabra2.nextInt();
                switch (respuesta){
                    case 1:
                        hacha();
                        break;
                    case 2:
                        Pico();
                        break;
                    case 3:
                        Espada();
                        break;
                    case 4:
                        Pala();
                        break;
                    case 5:
                        Hoz();
                        break;
                    case 6:
                        salir=true;
                        break;
                    default:
                        System.out.println("Del 1 al 6, pls");
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Inserte un numero");
            }
        }
    }

    private static void Hoz() {
        System.out.println("-----------------------------------------");
        Scanner palabra2 = new Scanner(System.in);
        String color, tamaño, duenio;
        int numFilo, numDaño;
        System.out.println("Color: ");
        color = palabra2.nextLine();
        hoz.setColor(color);
        System.out.println("Tamaño: ");
        tamaño = palabra2.nextLine();
        hoz.setTamaño(tamaño);
        System.out.println("Dueño: ");
        duenio = palabra2.nextLine();
        hoz.setDuenio(duenio);
        System.out.println("Filo: ");
        numFilo=palabra2.nextInt();
        hoz.setNumFilo(numFilo);
        System.out.println("Daño: ");
        numDaño=palabra2.nextInt();
        hoz.setNumDaño(numDaño);
        lista.add(new herramientasMinecraft(hoz.getColor(),hoz.getTamaño(),hoz.getDuenio(),hoz.getNumFilo(),hoz.getNumDaño()));
        System.out.println("-----------------------------------------");
    }

    private static void Pala() {
        System.out.println("-----------------------------------------");
        Scanner palabra2 = new Scanner(System.in);
        String color, tamaño, duenio;
        int numFilo, numDaño;
        System.out.println("Color: ");
        color = palabra2.nextLine();
        pala.setColor(color);
        System.out.println("Tamaño: ");
        tamaño = palabra2.nextLine();
        pala.setTamaño(tamaño);
        System.out.println("Dueño: ");
        duenio = palabra2.nextLine();
        pala.setDuenio(duenio);
        System.out.println("Filo: ");
        numFilo=palabra2.nextInt();
        pala.setNumFilo(numFilo);
        System.out.println("Daño: ");
        numDaño=palabra2.nextInt();
        pala.setNumDaño(numDaño);
        lista.add(new herramientasMinecraft(pala.getColor(),pala.getTamaño(),pala.getDuenio(),pala.getNumFilo(),pala.getNumDaño()));
        System.out.println("-----------------------------------------");
    }

    public static void Espada(){
        System.out.println("-----------------------------------------");
        Scanner palabra2 = new Scanner(System.in);
        String color, tamaño, duenio;
        int numFilo, numDaño;
        System.out.println("Color: ");
        color = palabra2.nextLine();
        espada.setColor(color);
        System.out.println("Tamaño: ");
        tamaño = palabra2.nextLine();
        espada.setTamaño(tamaño);
        System.out.println("Dueño: ");
        duenio = palabra2.nextLine();
        espada.setDuenio(duenio);
        System.out.println("Filo: ");
        numFilo=palabra2.nextInt();
        espada.setNumFilo(numFilo);
        System.out.println("Daño: ");
        numDaño=palabra2.nextInt();
        espada.setNumDaño(numDaño);
        lista.add(new herramientasMinecraft(espada.getColor(),espada.getTamaño(),espada.getDuenio(),espada.getNumFilo(),espada.getNumDaño()));
        System.out.println("-----------------------------------------");
    }
    public static void Pico(){
        System.out.println("-----------------------------------------");
        Scanner palabra2 = new Scanner(System.in);
        String color, tamaño, duenio;
        int numFilo, numDaño;
        System.out.println("Color: ");
        color = palabra2.nextLine();
        pico.setColor(color);
        System.out.println("Tamaño: ");
        tamaño = palabra2.nextLine();
        pico.setTamaño(tamaño);
        System.out.println("Dueño: ");
        duenio = palabra2.nextLine();
        pico.setDuenio(duenio);
        System.out.println("Filo: ");
        numFilo=palabra2.nextInt();
        pico.setNumFilo(numFilo);
        System.out.println("Daño: ");
        numDaño=palabra2.nextInt();
        pico.setNumDaño(numDaño);
        lista.add(new herramientasMinecraft(pico.getColor(),pico.getTamaño(),pico.getDuenio(),pico.getNumFilo(),pico.getNumDaño()));
        System.out.println("-----------------------------------------");
    }
    public static void hacha(){
        System.out.println("-----------------------------------------");
        Scanner palabra2 = new Scanner(System.in);
        String color, tamaño, duenio;
        int numFilo, numDaño;
        System.out.println("Color: ");
        color = palabra2.nextLine();
        hacha.setColor(color);
        System.out.println("Tamaño: ");
        tamaño = palabra2.nextLine();
        hacha.setTamaño(tamaño);
        System.out.println("Dueño: ");
        duenio = palabra2.nextLine();
        hacha.setDuenio(duenio);
        System.out.println("Filo: ");
        numFilo=palabra2.nextInt();
        hacha.setNumFilo(numFilo);
        System.out.println("Daño: ");
        numDaño=palabra2.nextInt();
        hacha.setNumDaño(numDaño);
        lista.add(new herramientasMinecraft(hacha.getColor(),hacha.getTamaño(),hacha.getDuenio(),hacha.getNumFilo(),hacha.getNumDaño()));
        System.out.println("-----------------------------------------");

    }
    public static void main(String[] args) {
        // write your code here
        Scanner palabra = new Scanner(System.in);
        boolean salir = false;
        while (!salir){
            Menu();
            try{
                int respuesta= palabra.nextInt();
                switch (respuesta){
                    case 1:
                        menu2();
                        Menu();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        salir=true;
                        break;
                    default:
                        System.out.println("Solo numeros entre 1 al 6");
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
