package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Ingrese la palabra: ");
        String palabra;
        Scanner entrada  = new Scanner(System.in);

        palabra = entrada.nextLine();

        int iterador = 0;
        int variable = palabra.length()-1;
        boolean falso = false;

        while ((iterador<variable) && (!falso)){

            if (palabra.charAt(iterador)==palabra.charAt(variable)){
                iterador++;
                variable--;
            } else {
                falso = true;
            }
        }

        if (!falso)
            System.out.println(palabra + " es un PALINDROMO");
        else
            System.out.println(palabra + " NO es un palindromo");
    }
}
