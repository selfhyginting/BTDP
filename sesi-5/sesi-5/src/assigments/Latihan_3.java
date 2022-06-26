package assigments;

import java.util.Scanner;

public class Latihan_3{
	public static void main(String[] args) {
		
		int pembelian; 
		float diskon; 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Masukkan jumlah pembelian = Rp. ");
		pembelian = scan.nextInt();
		
		System.out.print("Masukkan besar diskon = ");
		diskon = scan.nextInt();
		diskon = diskon/100;
		scan.close();
		
		float hargaBayar = pembelian - (pembelian*diskon);
			
		System.out.print("Harga bayar = Rp."+hargaBayar);
	}
}