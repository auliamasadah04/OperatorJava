
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aulia
 */
public class KasirMakanan {
    
    public static void main(String[] args) {
        System.out.println("Menu Makanan: ");
        System.out.println("1. Soto Ayam (15000)");
              
        int soto=15000;
        int rawon=17000;
        
        int jumlahBeli,total,bayar,kembali;
        Scanner input = new Scanner(System.in);
        System.out.println("Jumlah beli Soto: ");
        jumlahBeli= input.nextInt();
        total=jumlahBeli*soto;
        
        System.out.println("Jumlah beli Rawon: ");
        jumlahBeli= input.nextInt();
        total+=jumlahBeli*rawon;
        
        
        System.out.println("Total Pembelian: "+total);
        System.out.println("Masukkan Pembayaran:");
        bayar=input.nextInt();
        kembali=bayar-total;
        System.out.println("Jumlah Kembalian: "+kembali);
        
    
        
    }
    
}
