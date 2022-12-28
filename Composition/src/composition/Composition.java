/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composition;

/**
 *
 * @author user
 */
public class Composition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ogrenci ogrencil = new Ogrenci("Caglar", "Akar", "1033", "1983");
        OgreciIslemleri ogrenci = new OgreciIslemleri(ogrencil);
        ogrenci.ekle();
    }
    
}
