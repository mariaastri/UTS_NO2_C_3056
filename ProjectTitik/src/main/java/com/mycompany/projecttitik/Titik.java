/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projecttitik;
import java.util.Scanner;
/**
 *
 * @author WIN 11
 * 21103056
 * Maria Astri T
 */
public class Titik {
      
   Scanner cin = new Scanner(System.in);
   protected int x,y;
   public Titik (){
       x = 0;
       y = 0;
   }
   public void inisialisasiTitik(){
        System.out.println("Inisialisasi Titik");
        System.out.println("Masukan Nilai x : " );
        this.x = cin.nextInt();
        System.out.println("Masukan Nilai y : " );
        y = cin.nextInt();
        System.out.println("");
   }
   public void tampilTitik(){
       System.out.println("x = " + x);
       System.out.println("y = " + y);
       System.out.println("");
   }
   public void perkalianSkalar(){
       int s;  
       System.out.println("Perkalian Titik dengan Skalar");
       System.out.println("Masukkan nilai skalar: ");
       s = cin.nextInt();
       System.out.println("Hasil");
       System.out.println("x = " + (s * x ));
       System.out.println("y = " + (s * y));
       System.out.println("");
   }
   public void pencerminanSumbuX(){
       System.out.println("Pencerminan Sumbu X = " + (x +  (x + x - x)));
       System.out.println("Pencerminan Sumbu Y = " + - (y - (y - y - y)));
       System.out.println("");
   }
   public void pencerminanSumbuY(){
       System.out.println("Pencerminan Sumbu X = " + -(x - (x - x - x)));
       System.out.println("Pencerminan Sumbu Y = " + -(y - (y - y - y)));
       System.out.println("");
   }
   public int jarak (){
       int x2,y2;
       x2 = cin.nextInt();
       y2 = cin.nextInt();
       return (int) Math.sqrt(((x2 - x )* (x2 - x)) + ((y2 - y) * (y2 - y)));
       
   }
}
