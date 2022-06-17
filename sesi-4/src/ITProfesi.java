import java.util.Scanner;

public class ITProfesi{
	public static void main(String[] args) {
		String[] itprofesi = new String[5];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<itprofesi.length;i++) {
			System.out.print("Buah ke-"+i+": ");
			itprofesi[i] = scan.nextLine();
		}
		scan.close();
		System.out.println("--------------------");
		
		for(String b : itprofesi) {
			System.out.println(b);
		}
	}
}