import java.util.ArrayList;
import java.util.List;

public class MahasiswaDao {
    private List<Mahasiswa> daftarMahasiswa;

    public MahasiswaDao() {
        daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }

    public List<Mahasiswa> tampilkanDaftarMahasiswa() {
        return daftarMahasiswa;
    }

    public void hapusMahasiswa(String nim) {
        daftarMahasiswa.removeIf(m -> m.getNim().equals(nim));
    }

    public void perbaruiMahasiswa(String nim, Mahasiswa mahasiswaBaru) {
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            Mahasiswa m = daftarMahasiswa.get(i);
            if (m.getNim().equals(nim)) {
                daftarMahasiswa.set(i, mahasiswaBaru);
                break;
            }
        }
    }
}
