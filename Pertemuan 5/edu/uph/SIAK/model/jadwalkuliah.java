package edu.uph.SIAK.model;

import java.util.ArrayList;

public class jadwalkuliah {
    ArrayList<mahasiswa> Mahasiswa = new ArrayList<mahasiswa>();
    dosen Dosen;
    matakuliah Matakuliah;
    //ruangan


    public jadwalkuliah() {
    }


    public jadwalkuliah(ArrayList<mahasiswa> Mahasiswa, dosen Dosen, matakuliah Matakuliah) {
        this.Mahasiswa = Mahasiswa;
        this.Dosen = Dosen;
        this.Matakuliah = Matakuliah;
    }


    public ArrayList<mahasiswa> getMahasiswa() {
        return this.Mahasiswa;
    }

    public void setMahasiswa(ArrayList<mahasiswa> Mahasiswa) {
        this.Mahasiswa = Mahasiswa;
    }

    public dosen getDosen() {
        return this.Dosen;
    }

    public void setDosen(dosen Dosen) {
        this.Dosen = Dosen;
    }

    public matakuliah getMatakuliah() {
        return this.Matakuliah;
    }

    public void setMatakuliah(matakuliah Matakuliah) {
        this.Matakuliah = Matakuliah;
    }

    public void tambahMahasiswa(mahasiswa mhs){
        Mahasiswa.add(mhs);
    }

    public void tampilkanJadwalKuliah(){
        System.out.println("Jadwal Kuliah ");
        System.out.println("Nama Matakuliah : ");
        System.out.println("Dosen ");
        System.out.println("Kelas ");

        System.out.println("Daftar Mahasiswa ");
        System.out.println("Nama \t\t\t StudentID \t\t Jenis Kelamin ");
        for(mahasiswa mhs : Mahasiswa){
            System.out.println(mhs.toString());
        }
    }
    dosen dosen1 = new dosen("Ms. Kristina");
    dosen dosen2 = new dosen("Mr. Ade Maulana");
    dosen dosen3 = new dosen("Bertlan");

    matakuliah matakuliah1 = new matakuliah("Bahasa Indonesia");
    matakuliah matakuliah2 = new matakuliah("Pemrograman Berorientasi Objek (PBO)");
    matakuliah matakuliah3 = new matakuliah("Filsafat Ilmu Pengetahuan (FIP)");

    public void showJadwalKuliah(){
        char choice = 'y';
        do{
            System.out.println("Silahkan Memilih Mata Kuliah Anda.");
            System.out.println("1. Cloud Computing");
            System.out.println("2. Java");
            System.out.println("3. Matematika Diskrit");
            int i = Input.nextInt();
            if (i==1){
                System.out.println("Jadwal Kuliah ");
                System.out.println("Nama Matakuliah : " + matakuliah1.toString());
                System.out.println("Dosen : " + dosen1.toString());
                System.out.println("Daftar Mahasiswa ");
                System.out.println("Nama \t\t\t StudentID \t\t Jenis Kelamin ");

                for(mahasiswa mhs : Mahasiswa){
                    System.out.println(mhs.toString());
                }
            }
            else if (i==2){
                System.out.println("Jadwal Kuliah ");
                System.out.println("Nama Matakuliah : " + matakuliah2.toString());
                System.out.println("Dosen : " + dosen2.toString());
                System.out.println("Daftar Mahasiswa ");
                System.out.println("Nama \t\t\t StudentID \t\t Jenis Kelamin ");

                for(mahasiswa mhs : Mahasiswa){
                    System.out.println(mhs.toString());
                }
            }
            else if (i==3){
                System.out.println("Jadwal Kuliah ");
                System.out.println("Nama Matakuliah : " + matakuliah3.toString());
                System.out.println("Dosen : " + dosen3.toString());
                System.out.println("Daftar Mahasiswa ");
                System.out.println("Nama \t\t\t StudentID \t\t Jenis Kelamin ");

                for(mahasiswa mhs : Mahasiswa){
                    System.out.println(mhs.toString());
                }
            }
            else {
                System.out.println("Silahkan hanya menggunakan 1 - 3.");
            }
            System.out.println("Apakah anda masih ingin melakukan pencarian? [y / n] :"); 
            Input.nextLine();
            String Choice = Input.nextLine();
            yn = Choice.charAt(0);
        }while(choice == 'y' || choice == 'Y');
    }   
}