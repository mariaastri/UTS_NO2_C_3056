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
public class Mobil {
    protected String noPlat;
    protected String merk;
    protected float pajak;
    
    public Mobil(){
        
    }
    
    public Mobil(String noPlat, String merk, float pajak){
        this.noPlat = noPlat;
        this.merk = merk;
        this.pajak = pajak; 
    }
    
    public void tampilMobil(){
        System.out.println("No. Plat                    : "+noPlat);
        System.out.println("Merk                        : "+merk);
        System.out.println("Pajak                       : "+pajak+"%");
    }
}
