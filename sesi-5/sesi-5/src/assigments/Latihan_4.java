package assigments;

import java.util.Scanner;

public class Latihan_4{
	public static void main(String[] args) {
		
		int tahun; 
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Masukkan tahun = ");
		tahun = scan.nextInt();
		
		scan.close();
		
		if (tahun%4==0) {
			System.out.println("Tahun kabisat");
		}else System.out.println("Bukan tahun kabisat");
	}
}