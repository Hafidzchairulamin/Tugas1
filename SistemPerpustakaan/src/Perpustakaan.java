import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<Buku> bukuList;
    private ArrayList<Anggota> anggotaList;
    private ArrayList<Transaksi> transaksiList;

    public Perpustakaan() {
        bukuList = new ArrayList<>();
        anggotaList = new ArrayList<>();
        transaksiList = new ArrayList<>();
    }

    public void addBuku(Buku buku) {
        bukuList.add(buku);
    }

    public void addAnggota(Anggota anggota) {
        anggotaList.add(anggota);
    }

    private Buku findBuku(String id) {
        for (Buku buku : bukuList) {
            if (buku.getId().equals(id)) {
                return buku;
            }
        }
        return null; // Jika tidak ditemukan
    }

    private Anggota findAnggota(String id) {
        for (Anggota anggota : anggotaList) {
            if (anggota.getId().equals(id)) {
                return anggota;
            }
        }
        return null;

    public void pinjamBuku(String anggotaId, String bukuId) {
        Buku buku = findBuku(bukuId);
        Anggota anggota = findAnggota(anggotaId);
        if (buku != null && anggota != null) {
            if (buku.isTersedia()) {
                Transaksi transaksi = new Transaksi(anggota, buku);
                transaksiList.add(transaksi);
                buku.setTersedia(false);
                System.out.println("Buku berhasil dipinjam.");
            } else {
                System.out.println("Buku tidak tersedia.");
            }
        } else {
            System.out.println("Anggota atau buku tidak ditemukan.");
        }
    }

    public void kembalikanBuku(String anggotaId, String bukuId) {
        for (Transaksi transaksi : transaksiList) {
            if (transaksi.getAnggota().getId().equals(anggotaId) && transaksi.getBuku().getId().equals(bukuId)) {
                transaksi.getBuku().setTersedia(true);
                transaksiList.remove(transaksi);
                System.out.println("Buku berhasil dikembalikan.");
                return;
            }
        }
        System.out.println("Transaksi tidak ditemukan.");
    }


    public ArrayList<Buku> getBukuList() {
        return bukuList;
    }


    public ArrayList<Anggota> getAnggotaList() {
        return anggotaList;
    }


    public ArrayList<Transaksi> getTransaksiList() {
        return transaksiList;
    }


    public void tampilkanDaftarBuku() {
        System.out.println("Daftar Buku:");
        for (Buku buku : bukuList) {
            System.out.println(buku);
        }
    }


    public void tampilkanDaftarAnggota() {
        System.out.println("Daftar Anggota:");
        for (Anggota anggota : anggotaList) {
            System.out.println(anggota);
        }
    }


    public void tampilkanDaftarTransaksi() {
        System.out.println("Daftar Transaksi:");
        for (Transaksi transaksi : transaksiList) {
            System.out.println("Anggota: " + transaksi.getAnggota().getNama() + ", Buku: " + transaksi.getBuku().getJudul());
        }
    }
}