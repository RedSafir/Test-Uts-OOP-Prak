package latihan;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicBorders.MarginBorder;

public class Main {
    public static void main(String[] args) {
        // identitas Pembuat koding ini
        System.out.println("Welcome");
        System.out.println("Nama :");
        System.out.println("Miftah Nugraha");
        System.out.println("Nim : ");
        System.out.println("152021016");
        
        // inisiasi semua barang2
        Barang brg1 = new Barang("minyak", 50000, 4, new Makanan("bagus", "manis", "kuning"));
        Barang brg2 = new Barang("Es Krim", 40000, 4, new Minuman("bagus", "manis", "Merah"));
        Barang brg3 = new Barang("frutea", 50000, 5, new Makanan("bagus", "manis", "Merah"));
        Barang brg4 = new Barang("coffee", 50000, 5, new Minuman("bagus", "manis", "Hitam"));
        Barang brg5 = new Barang("steak", 40000, 5, new Makanan("bagus", "manis", "kuning"));
        Barang brg6 = new Barang("kopiko", 50000, 5, new Minuman("bagus", "manis", "Hitam"));

        System.out.println("====================== Non Member ==========================");

        // membuat obejct NonMember
        NonMember miftah = new NonMember("miftah");

        // memasukan ke keranjang
        Barang[] barangs1 = {brg1, brg2, brg3};
        System.out.println("// Transaksi pertama //");
        miftah.setJumlahBarangs(barangs1);

        // lakukan transaksi pertama
        miftah.tampilData();
        
        // memasukan ke keranjang (lagi)
        Barang[] barangs2 = {brg4, brg5, brg6};
        miftah.setJumlahBarangs(barangs2);
        System.out.println("// Transaksi Kedua //");

        // lakukan transaksi kedua
        miftah.tampilData();
        
        // minta hitung discount point
        miftah.penguranganPoin();
        // lakukan pembelian
        miftah.lakukanPembelian();

        System.out.println("=========================== Member ========================");
        
        // membuat class Member
        Member margon = new Member("margon");
        
        // memasukan ke keranjang
        Barang[] barangMargon = {brg4, brg5, brg6};
        margon.setJumlahBarangs(barangMargon);
        System.out.println("// Transaksi pertama //");
        // lakukan transaksi
        margon.tampilData();
        // lakukan pembelian
        margon.lakukanPembelian();
    }
}
