
import java.util.Scanner;

public class Kuisioner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        double rata, total = 0;
        int survei[][] = new int[10][6];
        double rataResp=0, rataTanya=01;
        int totalResp, totalTanya;
        
        System.out.println("================= Input Nilai Pertanyaan ==================");
        System.out.println();
        for (int i = 0; i < survei.length; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < survei[i].length; j++) {
                System.out.print("Nilai Pertanyaan ke-" + (j + 1) + ": ");
                survei[i][j] = input.nextInt();
                if (survei[i][j] < 1 || survei[i][j] > 5) {
                    System.out.println("Input nilai tidak valid");
                    j--;
                    continue;
                }
            }
            }
            // menghitung rata-rata tiap responden
            System.out.println("================= Rata Tiap Responden ==================");
                for (int i = 0; i < survei.length; i++) {
                    totalResp=0;
                    for (int j = 0; j < survei[i].length; j++) {
                        
                        totalResp += survei[i][j];
                    }
                    rataResp = totalResp / survei[i].length;
                    System.out.println("Rata-rata responden ke-" + (i+1) + ": " + rataResp);
                }
                
                // menghitung rata-rata tiap pertanyaan
                System.out.println("================= Rata Tiap Pertanyaan ==================");
                for (int j = 0; j < survei[0].length; j++) {
                    totalTanya=0;
                    for (int i = 0; i < survei.length; i++) {
                        
                        totalTanya += survei[i][j];
                    }
                    rataTanya = totalTanya / survei.length;
                    System.out.println("Rata-rata pertanyaan ke-" + (j+1) + ": " + rataTanya);
                }
            }
        }


