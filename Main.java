package uklll;

import java.util.Scanner;

public class Main {
    
    public static int a;
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Masyarakat masyarakat = new Masyarakat();
        Petugas petugas = new Petugas();
        Lelang lelang = new Lelang();
        Barang barang = new Barang();
        Main main = new Main();

        int id;
        int m;
        int confirm;
        
            System.out.println("----------"
                    + "\nSELAMAT DATANG DI PELELANGAN BELLA "
                    + "\n----------");
            
                System.out.println("----------PETUGAS----------");
                System.out.println("ID Nama\t\tAlamat\t\tTelepon \n"
                         + "1."+petugas.getNama(0) + "\t\t"+petugas.getAlamat(0)+"\t"+petugas.getTelephone(0)
                         + "\n2."+petugas.getNama(1) + "\t\t"+petugas.getAlamat(1)+"\t\t"+petugas.getTelephone(1)
                         + "\n3."+petugas.getNama(2) + "\t\t"+petugas.getAlamat(2)+"\t\t"+petugas.getTelephone(2));
                System.out.print("Masukkan ID Petugas : ");
                id = input.nextInt();
               
                if (id > 3) {
                    System.out.println("ID masyarakat tidak ditemukan");
                    System.out.print("Masukkan ID Petugas : ");
                id = input.nextInt();
                } else {
                    System.out.println("Petugas lelang: "   + petugas.getNama(id - 1));
                    System.out.println("");
                    
                }
                
                
                System.out.println("----------MASYARAKAT----------");
                System.out.println("ID Nama\t\tAlamat\t\tTelepon \n"
                         + "0."+masyarakat.getNama(0) + "\t\t"+masyarakat.getAlamat(0)+"\t"+masyarakat.getTelephone(0)
                         + "\n1."+masyarakat.getNama(1) + "\t\t"+masyarakat.getAlamat(1)+"\t\t"+masyarakat.getTelephone(1));
                System.out.println("");
                
                    System.out.println("----------BARANG----------");
                    System.out.println("Total Barang yang dapat dilelang= " + barang.getHargaAwal());
                    System.out.println("ID\t\tNama Barang\tHarga Awal \n"
                         + barang.getIdMasyarakat(0) + "\t\t"+barang.getNamaBarang(0) + "\t"+barang.getHargaAwal(0)
                         + "\n"+barang.getIdMasyarakat(1) + "\t\t"+barang.getNamaBarang(1)+"\t\t"+barang.getHargaAwal(1)
                         + "\n"+barang.getIdMasyarakat(2) + "\t\t"+barang.getNamaBarang(2)+"\t\t"+barang.getHargaAwal(2));
            
            System.out.println("\n----------PELELANGAN BARANG----------");
            System.out.print("Masukkan ID Barang Yang Ingin Dilelang: ");
            a = input.nextInt() - 1;
            if (a >= 3) {
                    System.out.println("Barang tidak ditemukan");
                    System.out.print("Masukkan ID Barang Yang Ingin Dilelang: ");
            a = input.nextInt() - 1;
             barang.ya();
                } else {
                    barang.ya();
                    
                }
            
            lelang.prosesLelang(petugas, masyarakat, lelang, barang, main);
        
                        
    }

    }
    

