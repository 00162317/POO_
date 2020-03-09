package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        
        List lista = new ArrayList<Integer>();

        for(int i = 0; i<100 ; i++){
            if(i%2==0){
                int[] arreglo = new int[i];
                System.out.println("Pares: "+arreglo.length);
            }
            else{
                lista.add(i);
            }
        }
        Iterator iterator = lista.iterator();
        while(iterator.hasNext()){
            System.out.println("Impares: "+iterator.next()+ " ");
        }
    }
}
