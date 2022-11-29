/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectkendaraan;

/**
 *
 * @author WIN 11
 * Maria Astri T
 * 21103056
 * S1SI-05-C
 */
public class ProjectKendaraan {

    public static void main(String[] args) {
        System.out.println("== DATA BUS ==");
        Bus b = new Bus("BUS001","Hyno",0.3f,150,50);
        b.hitungPajak();
        b.tampilInfo();
        
        System.out.println("");
        System.out.println("== DATA SEDAN ==");
        Sedan s = new Sedan("SEDAN0001","Toyota",0.1f,"Anti Ringsek","Kursi Pijat",500);
        s.hitungPajak();
        s.tampilInfo();
        
        System.out.println("");
        System.out.println("== DATA MINIBUS ==");
        MiniBus m = new MiniBus();
        m.hitungPajak();
        m.tampilInfo("MB0001","Daihatshu",0.2f,"Anti Peluru", "Sofa Empuk", 1000, 6, 10,"Pribadi, digunakan untuk kendaraan pribadi");
        
    } 
}
