public class Anggota {
    private String id;
    private String nama;

    public Anggota(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return "Anggota{" +
                "id='" + id + '\'' +
                ", nama='" + nama + '\'' +
                '}';
    }
}