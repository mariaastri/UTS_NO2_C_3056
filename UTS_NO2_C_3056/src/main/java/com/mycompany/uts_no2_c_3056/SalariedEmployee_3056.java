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
public class SalariedEmployee_3056 extends Employee_3056 {
    int upahMingguan_3056;

    public SalariedEmployee_3056(int upahMingguan_3056, String Nama_3056, String NIP_3056) {
        super(Nama_3056, NIP_3056);
        this.upahMingguan_3056 = upahMingguan_3056;
    }
    
    public float Gaji_3056(){
        return upahMingguan_3056;
    }
    
    public void cetakSalaried_3056(){
        super.cetakEmployee_3056();
        System.out.println("Upah Mingguan       : "+upahMingguan_3056);
    }
}
