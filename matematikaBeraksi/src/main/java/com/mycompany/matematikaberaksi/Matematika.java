/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matematikaberaksi;

/**
 *
 * @author WIN 11
* 21103056
* Maria Astri T
*/
public class Matematika {
    int penambahan=0;
    int pengurangan=0;	
    double hasil=0;
    
    void penambahanMtk(int a,int b){
        penambahan= a + b;
        System.out.println("Penambahan : "+a+ " + "+b+" = " +penambahan);
    }
        
    void penguranganMtk(int a,int b){
        pengurangan= a - b;
        System.out.println("Pengurangan :"+a+ " - "+b+" = "+pengurangan);
    }
}
