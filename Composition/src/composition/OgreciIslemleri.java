/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composition;

/**
 *
 * @author user
 */
public class OgreciIslemleri {
    
    public Ogrenci ogrenci;

    public OgreciIslemleri(Ogrenci ogrenci) {
        this.ogrenci = ogrenci;
    }
    
    public void ekle(){
        System.out.println("Ogrenci sisteme eklendi\n" + ogrenci.ad);
    }
    public void sil(){
        System.out.println("Ogrenci cikarildi\n" + ogrenci.numara);
    }
}
