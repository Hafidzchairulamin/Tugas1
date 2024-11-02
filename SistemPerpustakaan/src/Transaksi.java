import java.util.Date;

public class Transaksi {
    private Anggota anggota;
    private Buku buku;
    private Date tanggalPinjam;
    private Date tanggalKembali;
    private boolean returned;

    public Transaksi(Anggota anggota, Buku buku) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPinjam = new Date();
        this.returned = false;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public Date getTanggalPinjam() {
        return tanggalPinjam;
    }

    public Date getTanggalKembali() {
        return tanggalKembali;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
        if (returned) {
            this.tanggalKembali = new Date();
        }
    }

    @Override
    public String toString() {
        return "Transaksi{" +
                "anggota=" + anggota +
                ", buku=" + buku +
                ", tanggalPinjam=" + tanggalPinjam +
                ", tanggalKembali=" + tanggalKembali +
                ", returned=" + returned +
                '}';
    }
}