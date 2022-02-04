package com.company;

public class Class {

    private int nomer;
    private String soz;
    private int[] massiv;

    public Class(int nomer, String soz, int[] massiv) {
        this.nomer = nomer;
        this.soz = soz;
        this.massiv = massiv;
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public String getSoz() {
        return soz;
    }

    public void setSoz(String soz) {
        this.soz = soz;
    }

    public int[] getMassiv() {
        return massiv;
    }

    public void setMassiv(int[] massiv) {
        this.massiv = massiv;
    }

    void getInfoOfClass() {
        System.out.println("Nomer: "+getNomer());
        System.out.println("Soz: "+getSoz());
        System.out.print("Massiv: ");
        
        for (int i: getMassiv())
            System.out.print(i+" ");
    }
}
