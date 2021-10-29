package pertemuan1_07306_DwiCahyaPutra;

import java.util.Scanner;

public class progkalkulator_07306 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int hasil07306;
        int bil_07306,bil2_07306;
        int pilih_07306;
        System.out.println ("--------------------------------------");     
        System.out.println ("Selamat datang di Kalkulator sederhana");
        System.out.println ("--------------------------------------");
        
        do{
             
        System.out.println ("\n\nPilihan Operasi : ");
        System.out.println ("1. Penambahan ");
        System.out.println ("2. Pengqurangan ");
        System.out.println ("3. Perkalian ");
        System.out.println ("4. Pembagian ");
        
        System.out.println ("\n\n Pilih Operasi = ");
        pilih_07306 = input.nextInt();

        switch(pilih_07306){
            
            case 1 -> {
                System.out.println (" Masukan Angka Pertama = ");
                bil_07306 = input.nextInt();
                System.out.println (" Masukan Angka Kedua = ");
                bil2_07306 = input.nextInt();
                hasil07306 = bil_07306 + bil2_07306;
                System.out.println ("Hasil = " + hasil07306);
            }
            case 2 -> {
                System.out.println (" Masukan Angka Pertama = ");
                bil_07306 = input.nextInt();
                System.out.println (" Masukan Angka Kedua = ");
                bil2_07306 = input.nextInt();
                hasil07306 = bil_07306 - bil2_07306;
                System.out.println ("Hasil = " + hasil07306);
            }
            case 3 -> {
                System.out.println (" Masukan Angka Pertama = ");
                bil_07306 = input.nextInt();
                System.out.println (" Masukan Angka Kedua = ");
                bil2_07306 = input.nextInt();
                hasil07306 = bil_07306 * bil2_07306;
                System.out.println ("Hasil = " + hasil07306);
            }
            case 4 -> {
                System.out.println (" Masukan Angka Pertama = ");
                bil_07306 = input.nextInt();
                System.out.println (" Masukan Angka Kedua = ");
                bil2_07306 = input.nextInt();
                hasil07306 = bil_07306 / bil2_07306;
                System.out.println ("Hasil = " + hasil07306);
            }

            default -> {
                System.out.println ("Pengoperasian tidak tersedia");
            }
        }
          System.out.println(" lanjut pengoperasian ?");
          System.out.println(" 1 = lanjut");
          System.out.println(" 2 = keluar");
          pilih_07306 = input.nextInt();
      }while(pilih_07306==1);
    }
}
