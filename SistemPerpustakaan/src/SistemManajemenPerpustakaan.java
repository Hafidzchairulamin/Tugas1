import java.util.Scanner;

public class SistemManajemenPerpustakaan {
    private Perpustakaan perpustakaan;
    private Scanner scanner;

    public SistemManajemenPerpustakaan() {
        perpustakaan = new Perpustakaan();
        scanner = new Scanner(System.in);
    }

    public void menu() {
        while (true) {
            System.out.println("=== Sistem Manajemen Perpustakaan ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tambah Anggota");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Kembalikan Buku");
            System.out.println("5. Tampilkan Semua Buku");
            System.out.println("6. Tampilkan Semua Anggota");
            System.out.println("7. Tampilkan Semua Transaksi");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    tambahBuku();
                    break;
                case 2:
                    tambahAnggota();
                    break;
                case 3:
                    pinjamBuku();
                    break;
                case 4:
                    kembalikanBuku();
                    break;
                case 5:
                    tampilkanSemuaBuku();
                    break;
                case 6:
                    tampilkanSemuaAnggota();
                    break;
                case 7:
                    tampilkanSemuaTransaksi();
                    break;
                case 8:
                    System.out.println("Terima kasih! Keluar dari sistem.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private void tambahBuku() {
        System.out.print("Masukkan ID Buku: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan Judul Buku: ");
        String title = scanner.nextLine();
        System.out.print("Masukkan Penulis Buku: ");
        String author = scanner.nextLine();
        perpustakaan.addBuku(new Buku(id, title, author, true));
        System.out.println("Buku berhasil ditambahkan.");
    }

    private void tambahAnggota() {
        System.out.print("Masukkan ID Anggota: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan Nama Anggota: ");
        String name = scanner.nextLine();
        perpustakaan.addAnggota(new Anggota(id, name));
        System.out.println("Anggota berhasil ditambahkan.");
    }

    private void pinjamBuku() {
        System.out.print("Masukkan ID Anggota: ");
        String anggotaId = scanner.nextLine();
        System.out.print("Masukkan ID Buku: ");
        String bukuId = scanner.nextLine();
        perpustakaan.pinjamBuku(anggotaId, bukuId);
    }

    private void kembalikanBuku() {
        System.out.print("Masukkan ID Anggota: ");
        String anggotaId = scanner.nextLine();
        System.out.print("Masukkan ID Buku: ");
        String bukuId = scanner.nextLine();
        perpustakaan.kembalikanBuku(anggotaId, bukuId);
    }

    private void tampilkanSemuaBuku() {
        System.out.println("=== Daftar Buku ===");
        for (Buku buku : perpustakaan.getBukuList()) {
            System.out.println(buku);
        }
    }

    private void tampilkanSemuaAnggota() {
        System.out.println("=== Daftar Anggota ===");
        for (Anggota anggota : perpustakaan.getAnggotaList()) {
            System.out.println(anggota);
        }
    }

    private void tampilkanSemuaTransaksi() {
        System.out.println("=== Daftar Transaksi ===");
        for (Transaksi transaksi : perpustakaan.getTransaksiList()) {
            System.out.println(transaksi);
        }
    }

    public static void main(String[] args) {
        SistemManajemenPerpustakaan sistem = new SistemManajemenPerpustakaan();
        sistem.menu();
    }
}