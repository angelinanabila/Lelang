package uklll;

import java.util.ArrayList;

public class Petugas implements User{
    
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    
    public Petugas(){
        this.namaPetugas.add("Mira");
        this.alamat.add("Surabaya");
        this.telepon.add("08234567890");
        
        this.namaPetugas.add("Isma");
        this.alamat.add("Malang");
        this.telepon.add("0812345678");
        
        this.namaPetugas.add("Bella");
        this.alamat.add("Batu");
        this.telepon.add("082987654");
}
    public int getJumlahPetugas(){
        return this.namaPetugas.size();
    }
    @Override
    public void setNama(String namaPetugas){
        this.namaPetugas.add(namaPetugas);
    }
    @Override
    public void setAlamat(String alamat){
        this.alamat.add(alamat);
    }
    @Override
    public void setTelephone(String telepon){
        this.telepon.add(telepon);
    }
    
    @Override
    public String getNama(int id){
        return this.namaPetugas.get(id);
    }
    @Override
    public String getAlamat(int id){
        return this.alamat.get(id);
    }
    @Override
    public String getTelephone(int id){
        return this.telepon.get(id);
    }
}
