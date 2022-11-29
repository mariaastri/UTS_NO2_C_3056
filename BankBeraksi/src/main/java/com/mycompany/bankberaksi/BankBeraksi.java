/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bankberaksi;

/**
 *
 * @author WIN 11
 * 21103056
 * Maria Astri T
 */
public class BankBeraksi {

    public static void main(String[] args) {
         Bank a = new Bank ();
        System.out.println("Selamat Datang di Bank ABC");
        a.getsaldo(100000);
        a.simpanUang(100000, 500000);
        a.ambilUang(600000, 150000);
    }
}
