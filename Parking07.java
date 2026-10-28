import java.util.Scanner;

public class Parking07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jenis, durasi, total = 0;

        System.out.println("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar)");
        System.out.print("Masukkan jenis: ");
        jenis = sc.nextInt();

        while (jenis != 0) {
            if (jenis == 1 || jenis == 2) {
                System.out.print("Input durasi/JAM: ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total += 12500;
                } else {
                    if (jenis == 1) {
                        total += durasi * 3000;
                    } else if (jenis == 2) {
                        total += durasi * 2000;
                    }
                }
            }

            System.out.println("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar)");
            System.out.print("Masukkan jenis: ");
            jenis = sc.nextInt();
        }

        System.out.println("Total pendapatan parkir: Rp " + total);
        
        sc.close();
    }
}