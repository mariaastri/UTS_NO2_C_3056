/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no2_c_3056;

/**
 *
 * @author WIN 11
 * Maria Astri T
 * 21103056
 * S1SI-05-C
 */
public class UTS_NO2_C_3056 {

    public static void main(String[] args) {
        SalariedEmployee_3056 salaried = new SalariedEmployee_3056("Archie", "1001", 2500000);
        CommissionEmployee_3056 come = new CommissionEmployee_3056(800000, 100000, 5, "Mero", "1002", 0);
        ProjectPlanner_3056 prop = new ProjectPlanner_3056(600000, 150000, 3, "Solin", "1003", 0);
        
        salaried.cetakSalaried_3056();
        come.hitungGaji_3056();
        come.cetakCommission_3056();
        prop.hitungGajiProjectP_3056();
        prop.cetakProjectP_3056();
        
    }
}
