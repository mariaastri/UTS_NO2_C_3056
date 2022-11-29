/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sepedaberaksi;

/**
 *
 * @author WIN 11
 * 21103056
 * Maria Astri T
 */
public class SepedaBeraksi {

    public static void main(String[] args) {
        Sepeda sepedaku = new Sepeda();
        sepedaku.setGir(1); // menset nilai gir = 1 (sebelumnya 0)
        System.out.println("Gir saat ini: " + sepedaku.getGir());
        sepedaku.setGir(3); // menambahkan 3 pada posisi gir saat ini (1) 
        System.out.println("Gir saat ini: " + sepedaku.getGir());
    }
}
