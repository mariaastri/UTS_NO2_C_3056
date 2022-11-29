/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.materiif;

/**
 *
 * @author WIN 11
 */
public class MateriIF {

    public static void main(String[] args) {
        double diskon =0, totalBelanja = 80000;
        double prosentaseDiskon;

		if(totalBelanja >= 100000){
		   diskon = totalBelanja/10;
		}
                else if(totalBelanja < 100000 && totalBelanja >= 50000){
                    diskon = (totalBelanja*7.5)/100;
                }
                totalBelanja-=diskon; //totalBelanja = totalBelanja - Diskon
		 System.out.println("Diskon = " + diskon);
                 System.out.println("Total = " +totalBelanja);
    }

}

