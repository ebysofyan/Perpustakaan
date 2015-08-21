package com.eby.orm.entity;
// Generated Aug 16, 2015 10:48:52 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Anggota generated by hbm2java
 */
public class Anggota  implements java.io.Serializable {


     private int id;
     private String nama;
     private String alamat;
     private String kelas;
     private Set peminjamans = new HashSet(0);

    public Anggota() {
    }

	
    public Anggota(int id) {
        this.id = id;
    }
    public Anggota(int id, String nama, String alamat, String kelas, Set peminjamans) {
       this.id = id;
       this.nama = nama;
       this.alamat = alamat;
       this.kelas = kelas;
       this.peminjamans = peminjamans;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getAlamat() {
        return this.alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getKelas() {
        return this.kelas;
    }
    
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    public Set getPeminjamans() {
        return this.peminjamans;
    }
    
    public void setPeminjamans(Set peminjamans) {
        this.peminjamans = peminjamans;
    }




}


