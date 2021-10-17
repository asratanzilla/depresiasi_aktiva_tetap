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
public class menurun_tunggal {
    public void menuruntunggal(){
        Scanner input = new Scanner(System.in);
        double biaya_aset;
        double depresiasi_tunggal;
        double biaya_penyusutan;
        double presentase;
        
        System.out.println("Masukan Biaya Perolehan Aset= ");
        biaya_aset=input.nextInt();
        System.out.println("Masukan Presentase (%) Depresiasi Tunggal= ");
        depresiasi_tunggal=input.nextInt();
        presentase = depresiasi_tunggal/100;
        biaya_penyusutan = biaya_aset*presentase;
        System.out.println("Biaya Penyusutan= "+biaya_penyusutan);
    }
}
