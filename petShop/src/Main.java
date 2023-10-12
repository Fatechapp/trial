import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MahasiswaDao mahasiswaDao = new MahasiswaDao();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mahasiswa");
            System.out.println("3. Hapus Mahasiswa");
            System.out.println("4. Perbarui Informasi Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi (1/2/3/4/5): ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();  // Membersihkan karakter baru dari input

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Usia: ");
                    int usia = scanner.nextInt();
                    Mahasiswa mahasiswa = new Mahasiswa(nama, nim, usia);
                    mahasiswaDao.tambahMahasiswa(mahasiswa);
                    break;
                case 2:
                    List<Mahasiswa> daftar = mahasiswaDao.tampilkanDaftarMahasiswa();
                    for (Mahasiswa m : daftar) {
                        System.out.println(m);
                    }
                    break;
                case 3:
                    System.out.print("Masukkan NIM mahasiswa yang akan dihapus: ");
                    String nimHapus = scanner.nextLine();
                    mahasiswaDao.hapusMahasiswa(nimHapus);
                    break;
                case 4:
                    System.out.print("Masukkan NIM mahasiswa yang akan diperbarui: ");
                    String nimPerbarui = scanner.nextLine();
                    System.out.print("Masukkan Nama baru: ");
                    String namaBaru = scanner.nextLine();
                    System.out.print("Masukkan Usia baru: ");
                    int usiaBaru = scanner.nextInt();
                    Mahasiswa mahasiswaBaru = new Mahasiswa(namaBaru, nimPerbarui, usiaBaru);
                    mahasiswaDao.perbaruiMahasiswa(nimPerbarui, mahasiswaBaru);
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
