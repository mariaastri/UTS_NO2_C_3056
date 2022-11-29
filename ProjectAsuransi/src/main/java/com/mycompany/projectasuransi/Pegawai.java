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
public class Pegawai {
    public String NIP, nama, alamat;
    public int tahun;
 
    public Pegawai(){
        NIP = "2003";
        nama = "Maria";
        alamat = "Kapuas";
        tahun = 2018;
    }
    
    public void setPegawai(){
        System.out.println("Nama        : "+nama);
        System.out.println("NIP         : "+NIP);
        System.out.println("Alamat      : "+alamat);
        System.out.println("Tahun Masuk : "+tahun);
    }
}
