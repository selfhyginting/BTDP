package assigments;

import java.util.Scanner;

public class Latihan_2{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][] item = new String[2][3];
		
		System.out.println("Output : ");
		
		for (int i=0;i<2;i++) {
			for (int j=0;j<3;j++) {				
				System.out.print("Siapa yang akan duduk di kelas ("+i+","+j+")"+" : ");
				item[i][j] = scan.nextLine();
			}
		}
		
		scan.close();
		
		System.out.println("========================================");
		
		for (int i=0;i<2;i++) {
			for (int j=0;j<3;j++) {	
				if (item[i][j].length()<5) {
					System.out.print("|"+item[i][j]+"|\t \t");
				}else System.out.print("|"+item[i][j]+"|\t");
			}
			System.out.println();
		}
		
		System.out.println("========================================");
		
		
	}
}