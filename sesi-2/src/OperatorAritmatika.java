import java.util.Scanner;

public class OperatorAritmatika {
	public static void main(String[] args) {
    	int angka1;
    	int angka2;
    	int hasil;
    	
    	Scanner keyboard = new Scanner(System.in);
    	
        System.out.println("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.println("Input angka-2: ");
        angka2 = keyboard.nextInt();
        
        keyboard.close();
        
        hasil = angka1+angka2;
        System.out.println("hasil penjumlahan : " +hasil);
        hasil = angka1-angka2;
        System.out.println("hasil pengurangan : " +hasil);
        hasil = angka1*angka2;
        System.out.println("hasil perkalian : " +hasil);
        hasil = angka1/angka2;
        System.out.println("hasil pembagian : " +hasil);
        
    }
}