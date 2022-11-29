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
public class MiniBus extends Bus implements InterfaceBus, InterfaceSedan {
    private String tipe;
    private float totalPajak;

    public MiniBus() {
        
    }
    
    public MiniBus(String tipe, float totalPajak, String noPlat, String merk, float pajak, String fasilitasKenyamanan, String fasilitasKeamanan, int kapasitasCC, int kapasitasPenumpang, int kapasitasBagasi) {
        super(noPlat, merk, pajak, kapasitasPenumpang, kapasitasBagasi);
        this.tipe = tipe;
    }
    
    public void infoBus(){
          this.noPlat = noPlat;
          this.merk = merk;
          this.pajak = pajak; 
          this.kapasitasBagasi = kapasitasBagasi;
          this.kapasitasPenumpang = kapasitasPenumpang;
    }
    
    public void Infosedan(){
          this.noPlat = noPlat;
          this.merk = merk;
          this.pajak = pajak; 
    }
    
    public float hitungPajak(){
        return totalPajak = (float) (0.21f * 0.05f) + (0.206f * 0.03f);
    }
    
    public void infominibus(){
        super.infoBus();
    }
    
    public void tampilInfo(String noPlat, String merk, float pajak, String fasilitasKeamanan,String fasilitasKenyamanan, int kapasitasCC, int kapasitasPenumpang, int kapasitasBagasi, String tipe){
        
        System.out.println("No. Plat                    : "+noPlat);
        System.out.println("Merk                        : "+merk);
        System.out.println("Pajak                       : "+pajak+"%");
        System.out.println("Fasilitas Keamanan          : "+fasilitasKeamanan);
        System.out.println("Fasilitas Kenyamana         : "+fasilitasKenyamanan);
        System.out.println("Kapasitas CC                : "+kapasitasCC);
        System.out.println("Kapasitas Penumpang         : "+kapasitasPenumpang);
        System.out.println("Kapasitas Bagasi            : "+kapasitasBagasi);
        System.out.println("Tipe MiniBus                : "+tipe);
        System.out.println("Total Pajak                 : "+totalPajak+"%");
    }

    public void infosedan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
