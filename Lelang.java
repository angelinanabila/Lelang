package uklll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lelang extends Main{

    private ArrayList<Integer> idPenawar = new ArrayList<Integer>();
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> hargaTawar = new ArrayList<Integer>();
    Scanner input = new Scanner(System.in);

    public Lelang() {

        this.idPenawar.add(1);
        this.hargaTawar.add(0);
        this.idBarang.add(1);

        this.idPenawar.add(2);
        this.idBarang.add(0);
        this.hargaTawar.add(0);
        
    }

    public void prosesLelang(Petugas petugas, Masyarakat masyarakat, Lelang lelang, Barang barang, Main main) {
       
        int i = 0;
        int idmasyarakat = 0;
        String temp;
        if (barang.getStatus(i) == true) {
            System.out.println("\n----------LAKUKAN PENAWARAN BARANG!----------");
            do {
                System.out.print("\nApakah anda ingin melanjutkan proses lelang?[iya/tidak] : ");
                temp = input.next();
                if (!"tidak".equalsIgnoreCase(temp)) {
                    System.out.print("Masukkan Id Penawar                : ");
                    idmasyarakat = input.nextInt();
                    
                        System.out.println("Selamat datang " + masyarakat.getNama(idmasyarakat));
                        System.out.print("Masukkan harga tawar barang        : Rp.");
                        int hargatawar = input.nextInt();
                        if(hargatawar < barang.getHargaAwal(a)){
                            System.out.println("Harga tawar tidak boleh kurang dari harga awal");
                        } else {
                            editHargaTawar(idmasyarakat, hargatawar);
                            i++;
                        }
                    }
            } while (!"tidak".equals(temp));
            System.out.println("\nLelang sudah ditutup!");
            
            barang.editStatus(0, false);
            System.out.println("Status barang saat ini : " + barang.getStatus(0));

            System.out.println("\n----------HASIL LELANG----------");
            System.out.println("Nama Masyarakat \tNama Barang \tHarga Tawar \t");
            int x = hargaTawar.size();
            for (int j = 0; j < x; j++) {
                System.out.println(masyarakat.getNama(j) + "            \t" + barang.getNamaBarang(0) + "       \t" + "Rp." + hargaTawar.get(j));
            }

            int max = Collections.max(hargaTawar);
            int maxId = hargaTawar.indexOf(max);
            System.out.println(" ");
            System.out.println("Pemenang lelang atas nama " + masyarakat.getNama(maxId) + " dengan harga yang ditawar : Rp." + max);
            System.out.println(" ");

        } else {
            System.out.println("\nBARANG TIDAK DAPAT DITAWAR!");
            System.out.println("\n----------LAKUKAN PEMBELIAN BARANG----------");
            System.out.print("Masukkan Id Masyarakat              : ");
            idmasyarakat = input.nextInt();
            System.out.println("Selamat datang " + masyarakat.getNama(idmasyarakat));
            System.out.print("Apakah Anda yakin membeli " + barang.getNamaBarang(0) + "\nDengan harga Rp." + barang.getHargaAwal(0) + "(iya/tidak)      : ");
            String answer = input.next();
            if ("iya".equals(answer)) {
                System.out.println(barang.getNamaBarang(0) + " BERHASIL ANDA BELI!");

                System.out.println("\n----------HASIL PEMBELIAN----------");
                System.out.println("Nama Masyarakat \tNama Barang \tHarga Barang");
                int x = barang.getHargaAwal(0);
                System.out.println(masyarakat.getNama(idmasyarakat) + "     \t\t" + barang.getNamaBarang(0) + "     \t\t" + "Rp." + barang.getHargaAwal(0));
            } else {
                System.out.println("BARANG TIDAK JADI ANDA BELI!");
            }
        }
    }
    public void setLelang(Barang barang, int idPenawar, int idBarang, int hargaTawar) {
        this.idPenawar.add(idPenawar);
        this.idBarang.add(idBarang);
        this.hargaTawar.add(hargaTawar);
        barang.editStatus(idBarang, barang.getStatus(idBarang));
    }

    public int getIdBarang(int id) {
        return this.idBarang.get(id);
    }

    public int getIdMasyarakat(int id) {
        return this.idPenawar.get(id);
    }

    public int getJmlLelang() {
        return this.idPenawar.size();
    }
    
    public int getHargaTawar(int idBarang) {
        return this.hargaTawar.get(idBarang);
    }

    public void setHargaTawar(int hargaTawar) {
        this.hargaTawar.add(hargaTawar);
    }

    public void editHargaTawar(int idBarang, int harga) {
        this.hargaTawar.set(idBarang, harga);
    }
}
