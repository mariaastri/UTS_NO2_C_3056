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
public class Sales extends Pegawai {
    float gaji, jumlah, komisi, tgaji;
    
    public Sales(){
        System.out.println("Konstruktor Sales Berjalan...");
    }
    
    public void Sales(){
        NIP = "2003";
        nama = "Maria";
        alamat = "Kapuas";
        tahun = 2020;
        gaji = 5500000;
        jumlah = 8;
    }
    
    public void setSales(String a, String b, String c, int d, float e, float f){
        NIP = b;
        nama = a;
        alamat = c;
        tahun = d;
        gaji = e;
        jumlah = f;
    }
    
    public void komisi(){
        tgaji = gaji + (jumlah *50000);
    }
    
    public float gaji(){
        return tgaji = gaji+komisi;
    }
    
    public void cetakSales(){
        komisi();
        System.out.println("Nama              : "+nama);
        System.out.println("NIP               : "+NIP);
        System.out.println("Alamat            : "+alamat);
        System.out.println("Tahun Masuk Kerja : "+tahun);
        System.out.println("Gaji Pokok        : "+gaji);
        System.out.println("Komisi            : "+komisi);
        System.out.println("Gaji Akhir        : "+gaji());
    }
}
