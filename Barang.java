package uklll;

import java.util.ArrayList;
import java.util.Scanner;

public class Barang {
    
    Scanner input = new Scanner(System.in);
    
    private ArrayList<Integer> idMasyarakat = new ArrayList<Integer>();
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> hargaAwal = new ArrayList<Integer>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();

    public Barang() {
        idMasyarakat.add(1);
        namaBarang.add("Perunggu");
        hargaAwal.add(500000);
        
        idMasyarakat.add(2);
        namaBarang.add("Perak");
        hargaAwal.add(600000);
        
        idMasyarakat.add(3);
        namaBarang.add("Emas");
        hargaAwal.add(700000);
        
    }
    
    public void ya(){
        System.out.print("Apakah barang tersebut bisa ditawar?(iya/tidak): ");
        String answer = input.next();
        if (answer.equalsIgnoreCase("iya")) {
            this.status.add(true);
            System.out.println("Barang dapat ditawar");
        } else {
            System.out.println("Barang tidak dapat ditawar");
            this.status.add(false);
        }
    }

    //ini jumlah array
    public int getJumlahBarang() {
        return this.namaBarang.size();
    }
    
    public void setIdMasyarakat(int idMasyarakat){
        this.idMasyarakat.add(idMasyarakat);
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang.add(namaBarang);
    }

    public void setHargaAwal(int hargaAwal) {
        this.hargaAwal.add(hargaAwal);
    }

    public void setStatus(boolean status) {
        this.status.add(status);
    }
    
    public int getIdMasyarakat(int idBarang){
        return this.idMasyarakat.get(idBarang);
    }

    public String getNamaBarang(int idBarang) {
        return this.namaBarang.get(idBarang);
    }

    public int getHargaAwal(int idBarang) {
        return this.hargaAwal.get(idBarang);
    }

    public boolean getStatus(int idBarang) {
        return this.status.get(idBarang);
    }

    //ini untuk editnya
    public void editStatus(int idBarang, boolean status) {
        this.status.add(idBarang, status);
    }
    
    //ini overload
    public int getHargaAwal(){
        return hargaAwal.size();
    }
}
