import java.util.Scanner;
public class LuasLingkaran{
	public static void main(String[] args) {
		double P1 = 3.14; //statis
		int r;
		double Luas;
		Scanner scan = new Scanner(System.in);
		System.out.print("jari-jari = ");
		r=scan.nextInt();
		Luas = P1 * r * r;
		scan.close();
		System.out.println("Luas = "+Luas);
		
	}
}