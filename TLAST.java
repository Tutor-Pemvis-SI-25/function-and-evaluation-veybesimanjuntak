//Veybe Youlanda K M Simanjuntak - 12S25024

import java.util.*;
import java.lang.Math;

public class TLAST {
    public static void main(String[] args) {
        String perintah;
        String[] deskripsi = new String[10], kodeMK = new String[10], namaMK = new String[10], dosen = new String[10], deadline = new String[10], namaFile = new String[10], status = new String[10];
        int[] tingkat = new int[10];
        int[] hari = new int[10];
        double[] prioritas = new double[10];
        int taskCount;

        System.out.println(" Masukkan perintah ");
    }
    
    public static double hitungPrioritas(int tingkat, int hari) {
        double p;

        p = tingkat * 1.0 / hari;
        
        return p;
    }
    
    public static String rekomendasi(double prioritas) {
        if (prioritas > 3) {
        }
        
        return ;
    }
}


