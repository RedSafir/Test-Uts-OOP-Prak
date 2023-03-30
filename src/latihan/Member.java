package latihan;

public class Member extends Pelanggan{

    public Member(String nama) {
        super(nama);
    }

    @Override
    public void pembayaran() {
        this.hitungBarang();
        this.pembelian();
        this.hargaBrg = this.hargaBrg - (this.hargaBrg * 0.2);

        this.totHargaBrg = (int)Math.round(this.hargaBrg / 100) * 100;  
    }

    @Override
    public void setJumlahBarangs(Barang[] jumlahBarangs) {
        super.setJumlahBarangs(jumlahBarangs);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("discount Member 20%");
        this.pembayaran();
        this.totHargaOri();
        System.out.println("tot harga : " + this.totHargaBrg);
        System.out.println();
    }

}
