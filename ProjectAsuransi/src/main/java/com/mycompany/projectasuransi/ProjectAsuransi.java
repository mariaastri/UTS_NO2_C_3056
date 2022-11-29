/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectasuransi;

/**
 *
 * @author WIN 11
 * 21103056
 * Maria Astri T
 * S1SI-05-C
 */
public class ProjectAsuransi {

    public static void main(String[] args) {
        Satpam S = new Satpam();
        Sales T = new Sales();
        Manajer M = new Manajer();
        S.setSatpam("Rendra","0042","Jl. Itik 15",2000,300000,5);
        T.setSales("Wibisana","0185","Jl. Ayam 78",2006,500000,10);
        M.setManajer("Adi","0005","Jl. Angsa 56" ,1999 ,1500000 ,"Keuangan");
        System.out.println("\n\n==DISPLAY DATA KARYAWAN==");
        S.cetakSatpam();
        T.cetakSales();
        M.cetakManajer();
    }
}
