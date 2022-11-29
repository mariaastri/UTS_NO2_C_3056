/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectbuku1;

/**
 *
 * @author WIN 11
 * 21103056
 * Maria Astri T
 */
public class buku {
    
    //Atribut
    private String judul;
    private String pengarang;
    private int jumlah;
    
    //Konstuktur
    public void setNilai(String judul,String pengarang,int jumlah)
    {
        this.judul = judul;
        this.pengarang = pengarang;
        this.jumlah = jumlah;
    }
    
    //Method
    void cetakKeLayar()
    {
        System.out.println("Judul     : " + judul );
        System.out.println("Pengarang : " + pengarang );
        System.out.println("Jumlah    : " + jumlah );
        System.out.println("");
    } 
}
