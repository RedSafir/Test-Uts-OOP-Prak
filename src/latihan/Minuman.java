package latihan;

public class Minuman implements Konsumsi{
    // inisias variable
    private String kualitas;
    private String rasa;
    private String warna;

    // constructor 
    public Minuman(String kualitas, String rasa, String warna) {
        this.kualitas = kualitas;
        this.rasa = rasa;
        this.warna = warna;
    }

    // methode yang diberikan oleh interface konsumsi
    @Override
    public void kualitasMakanan() {
        System.out.println("kualitas : " + this.kualitas);
    }

    @Override
    public void rasaMakanan() {
        System.out.println("Rasa : " + this.rasa);
    }

    @Override
    public void warnaMakanan() {
        System.out.println("Warna : " + this.warna);
    }
    
}
