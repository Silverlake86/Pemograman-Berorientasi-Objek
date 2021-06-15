import edu.uph.SIAK.model.jadwalkuliah;
import edu.uph.SIAK.model.mahasiswa;
import edu.uph.SIAK.model.dosen;
public class App {
    public static void main(String[] args) throws Exception {
        mahasiswa mhs1 = new mahasiswa("Clavin", "01210121",false);
        mahasiswa mhs2 = new mahasiswa("SriRahayu", "01210121",true);
        mahasiswa mhs3 = new mahasiswa("Elvia", "01210121",true);

        
        jadwalkuliah JadwalKuliah = new jadwalkuliah();
        JadwalKuliah.tambahMahasiswa(mhs1);
        JadwalKuliah.tambahMahasiswa(mhs2);
        JadwalKuliah.tambahMahasiswa(mhs3);

        JadwalKuliah.tampilkanJadwalKuliah();
        System.out.println();

    }
}