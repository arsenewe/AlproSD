/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polinema.algoritmastrukturdata.pertemuan2;

/**
 *
 * @author septianenggars
 */


public class BarangMain{
    public static void main(String[] args) {
        Barang b1 = new Barang(); // instance objek
        
        // akses atribut
        b1.namaBarang = "Xiaomay";
        b1.jenisBarang = "Smartphone";
        b1.stok = 10;
        b1.hargaSatuan = 1250000;
        
        // akses method
        System.out.println("DATA SEBELUM UPDATE");
        b1.tampilBarang();
        System.out.println("UPDATE DATA - TAMBAH STOK");
        b1.tambahStok(4);
        System.out.println("Hasil setelah tambah stok");
        b1.tampilBarang();
        System.out.println("UPDATE DATA - KURANG STOK");
        b1.kurangiStok(2);
        System.out.println("Hasil setelah pengurngan stok");
        b1.tampilBarang();
        
        int hargaTotal = b1.hitungHargaTotal(4);
        System.out.println("Harga 4 item" + hargaTotal);
        
        Barang b2 = new Barang("Jambu Watch", "Smartcwatch", 18, 4500000);
        b2.tampilBarang();
        int hTotal = b2.hitungHargaTotal(2);
        System.out.println("Harga 2 item: " + hTotal);
    }
}
