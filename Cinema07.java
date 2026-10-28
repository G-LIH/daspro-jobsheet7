import java.util.Scanner;

public class Cinema07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int ticketPrice = 50000;
        int totalTicketsSold = 0;
        double totalRevenue = 0;
        
        System.out.println("Program Penjualan Tiket Bioskop");
        System.out.println("Ketik 0 untuk mengakhiri transaksi hari ini.\n");
        
        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli pelanggan: ");
            int tickets = sc.nextInt();
            
            if (tickets == 0) {
                break;
            }
            
            if (tickets < 0) {
                System.out.println("Jumlah tiket tidak valid! Silakan masukkan ulang.");
                continue;
            }
            
            double discount = 0;
            if (tickets > 10) {
                discount = 0.15; 
            } else if (tickets > 4) {
                discount = 0.10; 
            }
            
            double pricePerTicket = ticketPrice * (1 - discount);
            double subtotal = tickets * pricePerTicket;
            
            totalTicketsSold += tickets;
            totalRevenue += subtotal;
            
            System.out.println("Diskon yang didapat: " + (int)(discount * 100) + "%");
            System.out.println("Total harga untuk transaksi ini: Rp " + (int)subtotal + "\n");
        }
        
        System.out.println("\nREKAPITULASI PENJUALAN HARIAN");
        System.out.println("Total keseluruhan tiket terjual : " + totalTicketsSold);
        System.out.println("Total pendapatan penjualan      : Rp " + (long)totalRevenue);
        
        sc.close();
    }
}