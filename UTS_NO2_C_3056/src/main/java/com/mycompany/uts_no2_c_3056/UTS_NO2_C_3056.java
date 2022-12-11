/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no2_c_3056;
import java.util.Scanner;
/**
 *
 * @author WIN 11
 * Maria Astri T
 * 21103056
 * S1SI-05-C
 */
public class UTS_NO2_C_3056 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        char kembali;
        do{
            System.out.println("");
            System.out.println("Menu Employee");
            System.out.println("1. Salaried Employee");
            System.out.println("2. Commission Employee");
            System.out.println("3. Project Employee");
            System.out.print("Masukkan pilihan employee: ");
            int pilih= input.nextInt();

        switch (pilih){
            case 1:
                SalariedEmployee_3056 salariede = new SalariedEmployee_3056(250000, "Kusuma", "A123");
                               
                //Method
                salariede.cetakSalaried_3056();
                salariede.Gaji_3056();
            break;
            case 2:
                CommissionEmployee_3056 commise=new CommissionEmployee_3056 (8000000,35000,3,"Xie", "B321");
                              
                //Method
                commise.Gaji_3056();
                commise.cetakCommission_3056();
            break;
            case 3:
                ProjectPlanner_3056 projectplan= new ProjectPlanner_3056 (700000,55000,8,"Archie","C451");
                
                projectplan.Gaji_3056();
                projectplan.cetakProjectP_3056();
            default:
                System.out.println("");
                System.out.println("Error: Tidak ada pada menu!");
        }
        System.out.print("Ingin memilih menu lain (y/t)? ");
        kembali = input.next().charAt(0);
    }while (kembali != 't');
        System.out.println("");
        System.out.println("TERIMA KASIH!!!");
        
    }
}
