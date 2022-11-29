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
public class Manajer extends Pegawai {
    private int gaji, tgaji, Tunjangan, tahun;
    private String Divisi;
    
    public Manajer(){
        System.out.println("Konstruktor Manajer Berjalan...");
    }
    
    public void setManajer(String a, String b, String c, int d, int e, String f){
        NIP = b;
        nama = a;
        alamat = c;
        tahun = d;
        gaji = e;
        Divisi = f;
    }
    
    public float Tunjangan(){
        Tunjangan = 2015 - tahun;
        if(tahun >= 5){
            tgaji = gaji + (gaji/10);
        }
        if(tahun >= 5){
            tgaji = gaji + (gaji/20);
        }
        return 0;
    }
    public void cetakManajer(){
        System.out.println("Nama              : "+nama);
        System.out.println("NIP               : "+NIP);
        System.out.println("Alamat            : "+alamat);
        System.out.println("Gaji              : "+gaji);
        System.out.println("DIVISI            : "+Divisi);
        System.out.println("Tunjangan         : "+Tunjangan());
    }
    
}
