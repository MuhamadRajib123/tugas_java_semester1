/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab11no1;

/**
 *
 * @author Rajib
 */
public class Bab11No1 {

    public static void main(String[] args) {
       AnggotaKaryawan karyawan1 = new AnggotaKaryawan();
        karyawan1.setKaryawan(0001, "zenal", "A", "Manager", 15000000);
        karyawan1.getKaryawan();
        
        System.out.println("----------------------------");
        
        AnggotaKaryawan karyawan2 = new AnggotaKaryawan();
        karyawan2.setKaryawan(0002, "Nana", "B", "Supervisor1", 9000000);
        karyawan2.getKaryawan();
        
         System.out.println("----------------------------");
        
        AnggotaKaryawan karyawan3 = new AnggotaKaryawan();
        karyawan2.setKaryawan(0002, "yudi", "B", "Supervisor2", 8000000);
        karyawan2.getKaryawan();
    }
}
