/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bola;

/**
 *
 * @author WIN 11
 */
public class BolaMain {
    
    private double jari, diameter;
    private String wrana, nama;
    private final double phi = 3.14;
    private int berat;
    
    public void Bola(String nama, String warna, double jari, int berat){
        this.jari = jari;
        this.diameter = 2*jari;
        this.berat = berat;
        this.nama = nama;
        this.warna = warna
    }
    
    public void ukuran(double jari, double diameter){
        this.jari = jari;
        this.diameter = diameter;
    }
}
