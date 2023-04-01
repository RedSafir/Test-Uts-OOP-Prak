package latihan;

public class Member extends Pelanggan{

    // constructor
    public Member(String nama) {
        super(nama);
    }

    // mathode yang di override dari class Pelanggan
    @Override
    protected void pembayaran() {
        /*
         *  Setiap transaksi mendapatkan diskon 20% untuk member
         * 
         * 1. kalkulasikan terlebih dahulu hargatot dengan 
         * hitungBarang() dan pembelian() yang ada di Pelanggan
         * 
         * 2. lakukan diskon 20%
         * 
         * 3. bulatkan harganya dan ubah menjadi integer
         */
        this.hitungBarang(); 
        this.pembelian();

        // lakukan diskon 20%
        this.hargaBrg = this.hargaBrg - (this.hargaBrg * 0.2);

        // bulatkan harganya
        this.totHargaBrg = (int)Math.round(this.hargaBrg / 100) * 100;  
    }

    @Override
    // class yang dapat di panggil user untuk menampilkan barang2 dan tot harganya
    public void tampilData() {
        /*
         * panggil semua methode yang dibutuhkan untuk struct Member
         * 
         * 1. panggil tampilData yang ada di class parent
         * 
         * 2. panggil methode pembayaran
         * 
         * 3. perlihatkan hargra ori dan harga setelah di discount
         */

        //  tampilkan data dari parent
        super.tampilData();
        System.out.println("discount Member 20%");

        // panggil methode pembayaran
        this.pembayaran();

        // harga discount dan harga
        this.totHargaOri();
        System.out.println("total harga : " + this.totHargaBrg);
        System.out.println();
    }

}
