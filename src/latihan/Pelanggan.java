package latihan;

import latihan.Barang.tipe;

public abstract class Pelanggan{
    private String nama;
    private Barang[] jumlahBarangs;
    protected double hargaBrg;
    protected int totHargaBrg;

    abstract void pembayaran();

    public Pelanggan(String nama) {
        this.nama = nama;
    }

    public void pembelian(){
        if (hargaBrg > 100000){
            this.hargaBrg = this.hargaBrg - (this.hargaBrg * 0.15);
        }
    }

    public void hitungBarang(){
        for (Barang barang : jumlahBarangs) {
            if (barang.getTipeBarang() == tipe.Minuman){
                this.hargaBrg += (barang.getHargaBrg() - (barang.getHargaBrg() * 0.2));
            }else{
                this.hargaBrg += barang.getTotHargaBrg();
            }
        }
    }   

    public void setJumlahBarangs(Barang[] jumlahBarangs) {
        this.jumlahBarangs = jumlahBarangs;
    }

    public void tampilData(){
        System.out.println("nama : " + this.nama);
        for (Barang barang : jumlahBarangs) {
            System.out.print(barang.getNamaBrg() + " harga : " + barang.getHargaBrg() + " jumlah : " + barang.getJumBar());
            if(barang.getTipeBarang() == tipe.Minuman){
                System.out.println(" discount minuman : 40%");
            }else if(barang.getTipeBarang() == tipe.Makanan){
                System.out.println(" discount makanan : 40%");
            }else{
                System.out.println();
            }
        }
    }

    public void totHargaOri(){
        double tot = 0;
        for (Barang barang : jumlahBarangs) {
            tot += barang.getHargaBrg();
        }
        System.out.println("harga awal : " + (int)tot);
    }

    public void lakukanPembelian(){
        System.out.println("membayar sejumlah : " + this.totHargaBrg + "LUNASSS");
        this.totHargaBrg = 0;
    }
}
