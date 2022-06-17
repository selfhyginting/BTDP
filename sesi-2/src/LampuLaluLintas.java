import java.util.*;
public class LampuLaluLintas{
	public static void main(String[] args) {
		String lampu;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inputkan nama warna: ");
		lampu = scan.nextLine();
		scan.close();
		
		switch(lampu) {
			case "merah":
				System.out.println("Lampu merah, berhenti!");
				break;
			case "kuning":
				System.out.println("Lampu Kuning, harap hati-hati!");
				break;
			case "hijau":
				System.out.println("Lampu hijau, silahkan jalan!");
				break;
			default :
				System.out.println("Warna lampu salah!");
		}
		
	}
}