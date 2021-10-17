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
public class menurun_ganda {
    public void menurunganda(){
        Scanner input = new Scanner(System.in);
        double biaya_aset;
        double depresiasi_Pertahun;
        double biaya_penyusutan;
        double presentase;
        double depresiasi_ganda;
        
        System.out.println("Masukan Biaya perolehan aset= ");
        biaya_aset=input.nextInt();
        System.out.println("Masukan Presentase (%) Depresiasi Per Tahun= ");
        depresiasi_Pertahun=input.nextInt(); 
        presentase = depresiasi_Pertahun/100;
        depresiasi_ganda= 2*presentase;
        System.out.println("Depresiasi Ganda = "+depresiasi_ganda);
        biaya_penyusutan = biaya_aset*depresiasi_ganda;
        System.out.println("Biaya Penyusutan= "+biaya_penyusutan);
    }
}

