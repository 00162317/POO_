package com.company;

public class herramientasMinecraft {
    private String color, tamaño, duenio;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public int getNumFilo() {
        return numFilo;
    }

    public void setNumFilo(int numFilo) {
        this.numFilo = numFilo;
    }

    public int getNumDaño() {
        return numDaño;
    }

    public void setNumDaño(int numDaño) {
        this.numDaño = numDaño;
    }

    private int numFilo, numDaño;

    public herramientasMinecraft(String color, String tamaño, String duenio, int numFilo, int numDaño) {
        this.color = color;
        this.tamaño = tamaño;
        this.duenio = duenio;
        this.numFilo = numFilo;
        this.numDaño = numDaño;
    }
    public herramientasMinecraft(){

    }
    public void atacar(){
        System.out.println("TE ATACO BROOUU");
    }

    public void defiendo(){
        System.out.println("ME DEFIENDO BROU");
    }
}
