package com.company;

public class Class {

    /**
     * Class деген класс тузунуз
     * ал класстын номер деген бутун сан сактаган, соз деген соз сактаган жана массив деген сан сактаган массив бар
     * конструктор жазыныз
     * мейн методтон Classтын объектисин тузунуз
     * объекттин полелерине конструктор аркылуу маани бериниз
     * ошол объекттин полелерин консольго чыгарыныз.
     * */

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

        for (int i: getMassiv())
            System.out.print(i+" ");
    }
}
