package latihan;

import java.time.temporal.JulianFields;
import java.util.ArrayList;

public abstract class Pelanggan{
    // inisiasi property
    private String nama;
    private ArrayList<Barang> jumlahBarangs = new ArrayList<>();
    protected double hargaBrg;
    protected int totHargaBrg;

    // methode abstract yang harus dimiliki anak
    abstract protected void pembayaran();

    // constructor
    public Pelanggan(String nama) {
        this.nama = nama;
    }

    /*  
     * 1. Pada pembelian makan dan minum maka akan mendapat diskon 20% 
     * 
     * 2. Pada pembelian melebihi 100.000 sebelum pemotongan harga maka akan 
     * mendapat diskon 15% pada semua pembelian minuman
     * 
     * 3. Total harga yang perlu dibayar adalah bulatan ke atas per 100 (6780 menjadi 
     * 6800)
     * 
     * 4. Dapat menampilkan nama barang, harga barang dan jumlah barang yang dibeli.
     */

    public void pembelian(){
        // pembelian 1000000 mendapatkan discount 15%
        if (hargaBrg > 100000){
            this.hargaBrg = this.hargaBrg - (this.hargaBrg * 0.15);
        }
    }

    public void hitungBarang(){
        // cek apakah minuman atau makanan? bila ya maka mendapatkan discount 20%
        for (int i = 0; i < jumlahBarangs.size() - 1; i++) {
            Barang barang = jumlahBarangs.get(i);
            if (barang.getTipeBarang() instanceof Minuman || barang.getTipeBarang() instanceof Makanan){
                this.hargaBrg += (barang.getHargaBrg() - (barang.getHargaBrg() * 0.2));
            }else{
                this.hargaBrg += barang.getTotHargaBrg();
            }
        }
    }   

    // masukan barang ke dalam keranjang
    public void setJumlahBarangs(Barang[] Barangs) {
        for (Barang barang : Barangs) {
            jumlahBarangs.add(barang);
        }
    }


    public void tampilData(){
        // tampilakn semua data beserta discount2nya
        System.out.println("nama : " + this.nama);
        for (Barang barang : jumlahBarangs) {
            System.out.print(barang.getNamaBrg() + " harga : " + barang.getHargaBrg() + " jumlah : " + barang.getJumBar());
            if(barang.getTipeBarang() instanceof Minuman){
                System.out.println(" discount minuman : 20%");
            }else if(barang.getTipeBarang() instanceof Makanan){
                System.out.println(" discount makanan : 20%");
            }else{
                System.out.println();
            }
        }
    }

    // hitung harga ori kalau nggk ada discount
    public void totHargaOri(){
        double tot = 0;
        for (Barang barang : jumlahBarangs) {
            tot += barang.getHargaBrg();
        }
        System.out.println("harga awal : " + (int)tot);
    }

    // bayar, untung mengosongkan keranjang dan bayar
    public void lakukanPembelian(){
        System.out.println("membayar sejumlah : " + this.totHargaBrg);
        System.out.println( "=== LUNASSS ==");
        this.totHargaBrg = 0;

        for (int i = 0; i < jumlahBarangs.size() - 1; i++) {
            jumlahBarangs.remove(i);
        }
    }
}
