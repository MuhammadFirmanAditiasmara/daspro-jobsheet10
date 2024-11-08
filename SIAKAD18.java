
import java.util.Scanner;

public class SIAKAD18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] nilai = new int[4][3];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa  ke-" + (i + 1));
            // Modifikasi
            double totalPersiswa=0;

            
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = input.nextInt();
                // Modifikasi untuk menghitung dan menampilkan nilai rata-rata tiap siswa
                totalPersiswa += nilai[i][j];
            }
            // Modifikasi
            System.out.println("Nilai rata-rata: " + totalPersiswa/3);
        }
        // Tambahan kode program unutuk menghitung nilai rata-rata tiap matkul
        System.out.println("\n======================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah: ");
        
        for (int j = 0; j < 3; j++) {
            double totalPermatkul = 0;
        
            for (int i =0; i < 4; i++) {
                totalPermatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j+1) + ": " + totalPermatkul/4);
        }
    }

}
