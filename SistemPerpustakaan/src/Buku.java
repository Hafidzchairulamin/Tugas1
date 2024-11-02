public class Buku {
    private String id;
    private String judul;
    private String penulis;
    private boolean tersedia;


    public Buku(String id, String judul, String penulis, boolean tersedia) {
        this.id = id;
        this.judul = judul;
        this.penulis = penulis;
        this.tersedia = tersedia;
    }


    public String getId() {
        return id;
    }


    public String getJudul() {
        return judul;
    }


    public String getPenulis() {
        return penulis;
    }


    public boolean isTersedia() {
        return tersedia;
    }


    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }


    @Override
    public String toString() {
        return "Buku{" +
                "id='" + id + '\'' +
                ", judul='" + judul + '\'' +
                ", penulis='" + penulis + '\'' +
                ", tersedia=" + tersedia +
                '}';
    }
}