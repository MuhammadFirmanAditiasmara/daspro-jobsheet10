
import java.util.Scanner;

public class BioskopWithScanner18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        String penonton[][] = new String[4][2];
        int menu;

        // Modifikasi pilihan menu
        while (true) {

            System.out.print("Masukkan menu yang dipilih(1-3): ");
            menu = input.nextInt();
            input.nextLine();
            
            if (menu == 1) {
                System.out.println("======== INPUT DATA PENONTON =========");
                while (true) {

                    System.out.print("Masukkan nama: ");
                    nama = input.nextLine();
                    System.out.print("Masukkan baris(1-4): ");
                    baris = input.nextInt();
                    System.out.print("Masukkan kolom(1-2): ");
                    kolom = input.nextInt();

                    input.nextLine();
                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Input tidak valid, silahkan input kembali");
                        continue;
                    }

                    if (penonton[baris-1] [kolom-1] != null) {
                        System.out.println("Kursi pada baris " + baris + ", kolom " + kolom + " sudah terisi");
                        continue;
                    }
                    penonton[baris - 1][kolom - 1] = nama;

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = input.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;

                    }
                }
            } else if (menu == 2) {
                System.out.println("Tampilkan daftar penonton");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("Penonton pada baris ke-" + (i + 1) + " adalah :");
                    for (int j = 0; j < penonton[i].length; j++) {

                        if (penonton[i][j] == null) {

                            System.out.print("*** \t " );
                            
                        } else {
                            System.out.printf("%s \t ", penonton[i][j]);
                        }
                    }
                    System.out.println();
                }
            } else if (menu == 3) {
                System.out.println();
                System.out.println("=================== EXIT ===================");
                break;
            } else {
                System.out.println("Pilihan menu tidak valid    ");
            } 
            

        }
        input.close();
    }
}
