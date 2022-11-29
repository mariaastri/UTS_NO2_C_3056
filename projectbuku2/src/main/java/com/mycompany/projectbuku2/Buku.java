/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectbuku2;

/**
 *
 * @author WIN 11
 * 21103056
 * Maria Astri T
 */
public class Buku {
    
    private String judul;
    private String pengarang;
    
    public Buku()
    {
        judul = "Tidak diketahui";
        pengarang = "Tidak diketahui";
    }
    public Buku(String judul,String pengarang)
    {
        System.out.println("konstruktor buku sedang dijalankan...");
        this.judul = judul;
        this.pengarang = pengarang;
    }
    void cetakKeLayar()
    {
        if(judul==null && pengarang==null)
        return;
        System.out.println("Judul     : " + judul );
        System.out.println("Pengarang : " + pengarang );
    }
}
