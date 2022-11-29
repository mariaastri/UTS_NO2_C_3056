/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectbuku1;

/**
 *
 * @author WIN 11
 * 21103056
 * Maria Astri T
 */
public class Projectbuku1 {

    public static void main(String[] args)
    {
        buku a = new buku();
        a.setNilai("Jurassic Park","Michael Crichton",21);
        a.cetakKeLayar();
        
        buku b = new buku();
        b.setNilai("Detective Conan","Gosho Aoyama",30);
        b.cetakKeLayar();
    }
}
