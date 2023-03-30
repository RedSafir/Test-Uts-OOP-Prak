package latihan;

public class NonMember extends Pelanggan{
    private int point;
    public NonMember(String nama) {
        super(nama);
    }

    @Override
    public void pembayaran() {
        this.hitungBarang();
       
       if (this.hargaBrg >= 50000){
            this.point += 5;
       }

       if(this.hargaBrg >= 300000){
        this.hargaBrg = this.hargaBrg - (this.hargaBrg * 0.1);
       }

       this.pembelian();
       this.hargaBrg = this.hargaBrg - (this.hargaBrg * 0.2);

       this.totHargaBrg = (int)Math.round(this.hargaBrg / 100) * 100; 
    }

    public void penguranganPoin(){
        System.out.println("point berhasil di hitung!");
        this.totHargaOri();
        this.totHargaBrg -= this.point * 5000;
        System.out.println("dikurangi : " + this.point * 5000);
        System.out.println("total harga baru : " + this.totHargaBrg);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        this.pembayaran();
        this.totHargaOri();
        System.out.println("Non member bisa mendapat point!!");
        System.out.println("point yang diperoleh : " + this.point);
        System.out.println("kamu bisa menukarnya menjadi potongan harga!");
        System.out.println("tot harga : " + this.totHargaBrg);
        System.out.println();
    }

}
