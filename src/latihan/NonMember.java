package latihan;

public class NonMember extends Pelanggan{
    // inisiasi property
    private int point;
    
    // constructor
    public NonMember(String nama) {
        super(nama);
    }

    // mathode yang di override dari class Pelanggan
    // protected sehingga hanya bisa di gunakan di sini saja
    @Override
    protected void pembayaran() {
        /*
         * 1. Setiap transaksi sebesar 50.000 sebelum pemotongan harga akan mendapatkan 5 
         * point. Setiap point dapat dikonversikan sebesar 5.000
         * 
         * 2.  Setiap transaksi diatas 300.000 sebelum pemotongan harga akan mendapatkan 
         * diskon sebesar 10%
         * 
         * 3. Dapat menunjukan total point dan dapat di konversikan ke rupiah 
         * 
         * Optional: dapat menukar point untuk mengurangi total pembayaran
         */

        //  
        this.hitungBarang();
       
        // cek apakah totharga lebih dari 50000
       if (this.hargaBrg >= 50000){
            // bila ya, maka user dapat point
            this.point += 5;
       }

        // Setiap transaksi diatas 300.000     
       if(this.hargaBrg >= 300000){
            // harga akan mendapatkan diskon sebesar 10%
            this.hargaBrg = this.hargaBrg - (this.hargaBrg * 0.1);
       }

        // panggil methode pembelian kelas parent    
       this.pembelian();

        // bulatkan harganya     
       this.totHargaBrg = (int)Math.round(this.hargaBrg / 100) * 100; 
    }

    // bila user memilih untuk menggunakan point
    public void penguranganPoin(){
        System.out.println();
        System.out.println("Anda menggunakan pengurangan poin? point berhasil di hitung!");

        // maka setiap point bernilai 5000
        this.totHargaBrg -= this.point * 5000;

        // tampilakn harga yang baru dan harga sebelumnya
        System.out.println("dikurangi : " + this.point * 5000);
        System.out.println("total harga baru : " + this.totHargaBrg);

        // buat point yang tadi digunakan menjadi 0
        this.point = 0;
    }

    @Override
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

        //  panggil methode tampil data parent 
        super.tampilData();

        // panggil class pembayaran
        this.pembayaran();

        // harga discount dan harga tot
        this.totHargaOri();
        System.out.println("Non member bisa mendapat point setiap transaksi!");
        System.out.println("point yang dimilikimu : " + this.point);
        System.out.println("kamu bisa menukarnya menjadi potongan harga!");
        System.out.println("tot harga : " + this.totHargaBrg);
        System.out.println();
    }

}
