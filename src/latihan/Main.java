package latihan;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicBorders.MarginBorder;

import latihan.Barang.tipe;

public class Main {
    public static void main(String[] args) {
        Barang brg1 = new Barang("minyak", 50000, 4, tipe.Makanan);
        Barang brg2 = new Barang("sabun", 40000, 4, tipe.nonKonsumsi);
        Barang brg3 = new Barang("frutea", 50000, 5, tipe.Minuman);
        Barang brg4 = new Barang("coffee", 50000, 5, tipe.Minuman);
        Barang brg5 = new Barang("steak", 40000, 5, tipe.Makanan);
        Barang brg6 = new Barang("kopiko", 50000, 5, tipe.Minuman);

        NonMember miftah = new NonMember("miftah");

        Barang[] barangs1 = {brg1, brg2, brg3};

        miftah.setJumlahBarangs(barangs1);
        miftah.tampilData();

        Barang[] barangs2 = {brg4, brg5, brg6};

        miftah.setJumlahBarangs(barangs2);
        miftah.tampilData();

        miftah.penguranganPoin();
        miftah.lakukanPembelian();

        System.out.println("======================================================");

        // Member margon = new Member("margon");

        // Barang[] barangMargon = {brg4, brg5, brg6};

        // margon.setJumlahBarangs(barangMargon);
        // margon.lakukanPembelian();
    }
}
