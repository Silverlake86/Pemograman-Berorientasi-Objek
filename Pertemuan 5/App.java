import edu.uph.SIAK.model.jadwalkuliah;
import edu.uph.SIAK.model.mahasiswa;

public class app {
    public static void main(String[] args) throws Exception {
        
        mahasiswa mhs1 = new mahasiswa("Alvin Yogie", "03082180031",false);
        mahasiswa mhs2 = new mahasiswa("Michael Salim", "03082180035",true);
        mahasiswa mhs3 = new mahasiswa("Elvia Clarissa", "03082180037",true);
    
        jadwalkuliah JadwalKuliah = new jadwalkuliah();
        JadwalKuliah.tambahMahasiswa(mhs1);
        JadwalKuliah.tambahMahasiswa(mhs2);
        JadwalKuliah.tambahMahasiswa(mhs3);

        JadwalKuliah.tampilkanJadwalKuliah();
        System.out.println();

    }
}
