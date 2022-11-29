/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectpoint;

/**
 *
 * @author WIN 11
 * 21103056
 * Maria Astri T
 * S1SI-05-C
 */
public class ProjectPoint {

    /**Main Method*/
    public static void main(String[] args) {
        // Membuat instans dari kelas anak dan memanggil method yang dimilikinya
    Circle circle1=new Circle(6.5f, 8.2f, 1.9f);
    circle1.cetakPoint();
    System.out.println(" ");
    Circle circle2=new Circle (10, 5, 5);
    circle2.cetakPoint();
    }
}
