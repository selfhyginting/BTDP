package assigments;

import java.util.Scanner;

public class Latihan_1{
	public static void main(String[] args) {
		
		int[] bilangan = new int[3];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Menentukan Bilangan Terbesar, Terkecil, dan Rata-rata");
		
		System.out.print("Masukkan Bilangan Pertama (X) : ");
		bilangan[0] = scan.nextInt();
		
		System.out.print("Masukkan Bilangan Kedua (Y) : ");
		bilangan[1] = scan.nextInt();
		
		System.out.print("Masukkan Bilangan Ketiga (Z) : ");
		bilangan[2] = scan.nextInt();
		
		scan.close();
		
		float jumlah = 0;
		
		for (int i=0;i<3;i++) {
			jumlah = jumlah + bilangan[i];
		}
		
		float rata_rata = jumlah/3;
		
		int temp = bilangan[0];
		
		for (int i=1;i<3;i++) {
			if(bilangan[i]>temp) {
				temp = bilangan[i];
			}
		}
		
		System.out.println("Hasil :");
		System.out.println("Rata-ratanya adalah : "+rata_rata);
		System.out.println("Rata-ratanya adalah : "+temp);
		
	}
}