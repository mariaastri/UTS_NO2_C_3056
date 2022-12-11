/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_c_3056;

/**
 *
 * @author WIN 11
 * Maria Astri T
 * 21103056
 * S1SI-05-C
 */
public class ProjectPlanner_3056 extends Employee_3056 {
    int gajiPokok_3056, Komisi_3056, totalHasilProyek_3056, Pajak_3056;

    public ProjectPlanner_3056(int gajiPokok_3056, int Komisi_3056, int totalHasilProyek_3056, String Nama_3056, String NIP_3056) {
        super(Nama_3056, NIP_3056);
        this.gajiPokok_3056 = gajiPokok_3056;
        this.Komisi_3056 = Komisi_3056;
        this.totalHasilProyek_3056 = totalHasilProyek_3056;
    }
   
    public int Gaji_3056(){
        return gajiPokok_3056+(Komisi_3056*totalHasilProyek_3056)-(gajiPokok_3056*5/100);
    }
    
    public void cetakProjectP_3056(){
        super.cetakEmployee_3056();
        System.out.println("Gaji Pokok          : "+gajiPokok_3056);
        System.out.println("Komisi              : "+Komisi_3056);
        System.out.println("Total Hasil Proyek  : "+totalHasilProyek_3056);
        System.out.println("Total Gaji          : "+(gajiPokok_3056+(Komisi_3056*totalHasilProyek_3056)-(gajiPokok_3056*5/100)));
    }
}
