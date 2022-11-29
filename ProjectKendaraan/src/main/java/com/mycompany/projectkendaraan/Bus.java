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
public class Bus extends Mobil implements InterfaceBus {
    int kapasitasPenumpang;
    int kapasitasBagasi;
    private InterfaceBus interfaceBus;
    float totalPajak;
    
    public Bus(){
        
    }
    
    public Bus(String noPlat, String merk, float pajak, int kapasitasPenumpang, int kapasitasBagasi){
        super(noPlat,merk,pajak);
        this.kapasitasBagasi = kapasitasBagasi;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }
    
    public float hitungPajak(){
        return totalPajak = (float) (pajak + (pajak * kapasitasPenumpang * kapasitasBagasi * 0.00005));
    }
    
    public void infoBus(){
        super.tampilMobil();
        System.out.println("Kapasitas Penumpang         : "+kapasitasPenumpang);
        System.out.println("Kpasitas Bagasi             : "+kapasitasBagasi);
        System.out.println("Total Pajak                 : "+totalPajak+"%");
    }  
    
    public void tampilInfo(){
        super.tampilMobil();
        System.out.println("Kapasitas Penumpang         : "+kapasitasPenumpang);
        System.out.println("Kpasitas Bagasi             : "+kapasitasBagasi);
        System.out.println("Total Pajak                 : "+totalPajak+"%");
    }
}
