package edu.uph.SIAK.model;

public class matakuliah {
    String nama_kuliah;

    public matakuliah() {
    }

    public matakuliah(String nama_kuliah) {
        this.nama_kuliah = nama_kuliah;
    }

    public String getNama() {
        return this.nama_kuliah;
    }

    public void setNama(String nama_kuliah) {
        this.nama_kuliah = nama_kuliah;
    }


    @Override
    public String toString() {
        return getNama();
    } 
}