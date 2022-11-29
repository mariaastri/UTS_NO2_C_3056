/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectasuransi;

/**
 *
 * @author WIN 11
 * 21103056
 * Maria Astri T
 * S1SI-05-C
 */
public class Satpam extends Pegawai {
    private int gaji, tgaji, lembur, tahun;
    
    public Satpam(){
        System.out.println("Konstruktor Satpam Berjalan...");
    }
    
    public void Satpam(){
        NIP = "2003";
        nama = "Maria";
        alamat = "Kapuas";
        tahun = 2020;
        gaji = 5500000;
        lembur = 8;
    }
    
    public void setSatpam(String a, String n, String alt, int t, int g, int j){
        NIP = a;
        nama = n;
        alamat = alt;
        tahun = t;
        gaji = g;
        lembur = j;
    }
    
    public void lembur(){
        tgaji = gaji + (lembur * 10000);
    }
    
    public void cetakSatpam(){
        System.out.println("Nama              : "+nama);
        System.out.println("NIP               : "+NIP);
        System.out.println("Alamat            : "+alamat);
        System.out.println("Tahun Masuk Kerja : "+tahun);
        System.out.println("Gaji Pokok        : "+gaji);
        System.out.println("Lembur            : "+lembur+" Jam");
        System.out.println("Gaji Akhir        : "+tgaji);
    }
}
