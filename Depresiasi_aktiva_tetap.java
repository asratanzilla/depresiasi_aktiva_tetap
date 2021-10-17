/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.mdpl;

import java.util.Scanner;

/**
 *
 * @author Anindya
 */
public class Depresiasi_aktiva_tetap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String ulg = "y";
        int metode;
        while (ulg.equals("y")){
        System.out.println("");
        System.out.println("========== PILIH METODE ==========");
        System.out.println("1.Metode Garis Lurus\n" +
                "2.Metode Saldo Menurun Ganda\n" +
                "3.Metode Saldo Menurun Tunggal ");
        System.out.println("Masukan Pilihan (1/2/3)= "); 
        metode = input.nextInt();
        System.out.println("==================================");
        
        switch(metode){
            case 1 : garis_lurus g=new garis_lurus();g.garislurus();break;
            case 2 : menurun_ganda mg=new menurun_ganda();mg.menurunganda();break;
            case 3 : menurun_tunggal mt=new menurun_tunggal();mt.menuruntunggal();break;
        }
        
            System.out.println("==================================");
            System.out.print("Apakah anda ingin mengulang (y?t)?");
            ulg = input.next();
        }
    }
}
