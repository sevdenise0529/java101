/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package katilim;

/**
 *
 * @author user
 */
public class Ogretmen extends Kullanici {
   private int aldigiDersSayisi;

    public Ogretmen(int aldigiDersSayisi, String kullaniciAdi, String sifre) {
        super(kullaniciAdi, sifre);
        this.aldigiDersSayisi = aldigiDersSayisi;
    }

    public int getAldigiDersSayisi() {
        return aldigiDersSayisi;
    }

    public void setAldigiDersSayisi(int aldigiDersSayisi) {
        this.aldigiDersSayisi = aldigiDersSayisi;
    }
   
   
}
