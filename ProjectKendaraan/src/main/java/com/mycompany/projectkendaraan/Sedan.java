/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectkendaraan;

/**
 *
 * @author WIN 11
 * Maria Astri T
 * 21103056
 * S1SI-05-C
 */
public class Sedan extends Mobil {
    protected String fasilitasKeamanan;
    protected String fasilitasKenyamanan;
    protected int kapasitasCC;
    protected float totalPajak;
    
    public Sedan(){
        
    }
    
    public Sedan(String noPlat, String merk, float pajak, String fasilitasKeamanan, String fasilitasKenyamanan, int kapasitasCC ){
        super(noPlat,merk,pajak);
        this.fasilitasKeamanan = fasilitasKeamanan;
        this.fasilitasKenyamanan = fasilitasKenyamanan;
        this.kapasitasCC = kapasitasCC;
    }
    
    public float hitungPajak(){
        return totalPajak = (float) (pajak +(pajak * kapasitasCC * 0.00005));
    }
    
    public void infoSedan(){
          super.tampilMobil();
          System.out.println("Fasilitas Keamanan          : "+fasilitasKeamanan);
          System.out.println("Fasilitas Kenyamanan        : "+fasilitasKenyamanan);
          System.out.println("Kapasitas CC                : "+kapasitasCC);
          System.out.println("Total Pajak                 : "+totalPajak+"%");
    }
    
    public void tampilInfo(){
        super.tampilMobil();
        System.out.println("Fasilitas Keamanan          : "+fasilitasKeamanan);
        System.out.println("Fasilitas Kenyamanan        : "+fasilitasKenyamanan);
        System.out.println("Kapasitas CC                : "+kapasitasCC);
        System.out.println("Total Pajak                 : "+totalPajak+"%");
    }
}
