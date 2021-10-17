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
public class garis_lurus {
    public void garislurus(){
    Scanner input = new Scanner(System.in);
    double biaya_aset;
    double nilai_residu;
    double umur_ekonomis;
    double biaya_penyusutan;

        System.out.println("Masukan Biaya Perolehan Aset= ");
        biaya_aset=input.nextInt();
        System.out.println("Masukan Nilai Residu= ");
        nilai_residu=input.nextInt();
        System.out.println("Masukan Umur Ekonomis= ");
        umur_ekonomis=input.nextInt();
        biaya_penyusutan = (biaya_aset-nilai_residu)/umur_ekonomis;
        System.out.println("Biaya Penyusutan= "+biaya_penyusutan);
    } 
}
