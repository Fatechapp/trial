public class Mahasiswa {
    private String nama;
    private String nim;
    private int usia;

    // Constructor
    public Mahasiswa(String nama, String nim, int usia) {
        this.nama = nama;
        this.nim = nim;
        this.usia = usia;
    }

    // Getter dan setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    @Override
    public String toString() {
        return "NIM: " + nim + ", Nama: " + nama + ", Usia: " + usia;
    }
}
