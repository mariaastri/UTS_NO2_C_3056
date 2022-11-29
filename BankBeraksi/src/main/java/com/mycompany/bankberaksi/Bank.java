/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankberaksi;

/**
 *
 * @author WIN 11
 * Maria Astri T
 * 21103056
 */
public class Bank {
    
    public int saldoSaatIni;
    public int simpanUang;
    public int saldoawal = 100000;
    public int ambilUang;

    public void Bank(int saldoSaatIni, int simpanUang, int ambilUang) {
        this.saldoSaatIni = saldoSaatIni;
        this.simpanUang = simpanUang;
        this.ambilUang = ambilUang;
    }

    public void getsaldo (int saldoawal){
        System.out.println("Saldo Saat Ini : " +saldoawal);
        System.out.println("");
    }
    
    public void simpanUang (int saldoSaatIni, int simpanUang){
        saldoSaatIni = saldoawal + simpanUang;
        System.out.println("Simpan Uang : " +simpanUang);
        System.out.println("Saldo Saat Ini : " +saldoSaatIni);
        System.out.println("");
    }
    
    public void ambilUang (int saldoawal, int ambilUang){
        saldoSaatIni = saldoawal - ambilUang;
        System.out.println("ambil Uang : " +ambilUang);
        System.out.println("saldo Saat ini : " +saldoSaatIni);
        System.out.println("");
    }
     
}
