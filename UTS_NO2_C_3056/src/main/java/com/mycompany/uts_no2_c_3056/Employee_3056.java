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
public class Employee_3056 {
    protected String Nama_3056, NIP_3056;
    protected double Gaji_3056;
    
    public Employee_3056(){
        
    }

    public Employee_3056(String Nama_3056, String NIP_3056, int Gaji_3056) {
        this.Nama_3056 = Nama_3056;
        this.NIP_3056 = NIP_3056;
        this.Gaji_3056 = Gaji_3056;
    }
    
    public void cetakEmployee_3056(){
        System.out.println("");
        System.out.println("Nama Karyawan       : "+Nama_3056);
        System.out.println("NIP Karyawan        : "+NIP_3056);
    }
}
