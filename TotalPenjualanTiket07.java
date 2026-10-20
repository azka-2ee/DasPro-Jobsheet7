import java.util.Scanner;
public class TotalPenjualanTiket07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Deklarasi
        int hargaTiket = 50000, jumlahTiket, totalTiket = 0;
        double diskon = 0, totalHarga, pemasukan = 0;
        String pilihan = "ya";

        //Inisialisasi
        int pelanggan = 0;

        //Proses
        do {
          System.out.print("Jumlah tiket: ");
          jumlahTiket = sc.nextInt();
          sc.nextLine();
          totalTiket += jumlahTiket;

          if (jumlahTiket > 10) diskon = hargaTiket * 0.15;
          else if (jumlahTiket > 4) diskon = hargaTiket * 0.1;
          else if (jumlahTiket > 0) diskon = 0;
          else continue;

          totalHarga = (hargaTiket - diskon) * jumlahTiket;
          pemasukan += totalHarga;

          

          
          System.out.print("Ada pemesan lagi? (ya/tidak): ");
          pilihan = sc.nextLine();
          pelanggan++;
        } while (pilihan.equalsIgnoreCase("ya"));

        System.out.println("Tiket yang terjual: " + totalTiket + " tiket");
        System.out.println("Pemasukan hari ini: Rp" + pemasukan);

        sc.close();
    }
}
