import java.util.Scanner;
public class TotalPembayaranParkir07 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Deklarasi
    int jenis, durasi = 0, total = 0;

    //Proses
    do {
      System.out.print("Jenis kendaraan (mobil = 1, motor = 2, keluar = 0): ");
      jenis = sc.nextInt();
      if (jenis == 1 || jenis == 2) {
        System.out.print("Lama parkir: ");
        durasi = sc.nextInt();
        if (jenis == 1) total += durasi * 3000;
        else total += durasi * 2000;
      }
    } while (jenis != 0);

    System.out.println("Total pembayaran: Rp" + total);
    sc.close();
    }
}
