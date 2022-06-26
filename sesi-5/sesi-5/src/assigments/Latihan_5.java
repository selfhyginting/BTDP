package assigments;

import java.util.Scanner;

import java.util.LinkedList;

public class Latihan_5{
	
	public static String namaBarang(int code) {
		
		String namaBarang;
		
		switch (code) {
			case 1 : namaBarang = "Mouse Bluetooth 5.0";
			break;
			case 2 : namaBarang = "Headphone Eksternal";
			break;
			case 3 : namaBarang = "PowerBank 10.000 mAh";
			break;
			case 4 : namaBarang = "Tripod Kamera       ";
			break;
			case 5 : namaBarang = "Smart Watch Xiaomi";
			break;
			default : namaBarang = "Tidak ditemukan";
		}
		
		return namaBarang;
	}
	
	public static double harga(int code) {
		
		double harga;
		
		switch (code) {
			case 1 : harga = 149999;
			break;
			case 2 : harga = 246000;
			break;
			case 3 : harga = 136000;
			break;
			case 4 : harga  = 267999;
			break;
			case 5 : harga = 899000;
			break;
			default : harga = 0;
		}
		
		return harga;
	}
	
	public static double diskon(int code) {
		
		double diskon;
		
		switch (code) {
			case 1 : diskon = 0.1;
			break;
			case 2 : diskon = 0.05;
			break;
			case 3 : diskon = 0;
			break;
			case 4 : diskon = 0.2;
			break;
			case 5 : diskon = 0.1;
			break;
			default : diskon = 0;
		}
		
		return diskon;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int jumlah;
		String namaBarang;
		double harga, diskon, subTotal;
		double totalBayar = 0;
		
		LinkedList<Integer> item = new LinkedList<>();
		LinkedList<Integer> qty = new LinkedList<>();
		
		System.out.println("PROGRAM JAVA TENTANG PENJUALAN BARANG");
		
		System.out.print("Masukkan Jumlah Beli : ");
		jumlah = scan.nextInt();
		
		for (int i=0;i<jumlah;i++) {			
			System.out.print("Masukkan Kode Barang Ke-"+(i+1)+" : ");
			item.add(scan.nextInt());
			
			System.out.print("Masukkan Qty Ke-"+(i+1)+" : ");
			qty.add(scan.nextInt());
		}
		
		scan.close();
		
		System.out.println("\nNo \t Nama Barang \t \t Harga \t \t QTY \tDiskon SubTotal");
		
		for(int j=0;j<jumlah;j++) {
			namaBarang = namaBarang(item.get(j));
			diskon = diskon(item.get(j));
			harga = harga(item.get(j));
			subTotal = harga*qty.get(j) - (harga*qty.get(j)*diskon);
			totalBayar = totalBayar + subTotal;
			System.out.println((j+1)+"\t"+namaBarang+"\t"+harga+"\t"+qty.get(j)+"\t"+(diskon*100)+"%"+"\t"+subTotal);
		}
		
		System.out.println("\n Total Bayar : Rp. "+totalBayar);
		
	}
}