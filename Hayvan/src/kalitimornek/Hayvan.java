/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalitimornek;

/**
 *
 * @author user
 */
public class Hayvan {
    public int id;
    public String isim;
    public int yas;
    
    public void suVer(){
        System.out.println("Sulandi");
    }
    public void yemekVer(String yemek){
        System.out.println("Yemlendi: " + yemek);
    }
    public void asiYap(){
        System.out.println("Hayvan asilandi");
    }
    public void temizle(){
        System.out.println("Hayvan temizlendi.");
    }
}
