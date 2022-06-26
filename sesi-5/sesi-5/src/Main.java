public class Main extends BangunDatar{
	
	public static void main(String[] args) {
		
		BangunDatar tampil = new BangunDatar();
		
		tampil.TampilLuas("Persegi Panjang");
		PersegiPanjang persegipanjang = new PersegiPanjang(12,3);
		System.out.println(persegipanjang.luasPersegiPanjang());
		tampil.TampilKeliling("Persegi Panjang");
		System.out.println(persegipanjang.kelilingPersegiPanjang());
		
		System.out.println("---------------------------");
		
		tampil.TampilLuas("Lingkaran");
		Lingkaran lingkaran = new Lingkaran(3);
		System.out.println(lingkaran.luasLingkaran());
		tampil.TampilKeliling("Lingkaran");
		System.out.println(lingkaran.kelilingLingkaran());

		System.out.println("---------------------------");
		
		tampil.TampilLuas("Persegi");
		Persegi persegi = new Persegi(4);
		System.out.println(persegi.luasPersegi());
		tampil.TampilKeliling("Persegi");
		System.out.println(persegi.kelilingPersegi());

		System.out.println("---------------------------");
		
		tampil.TampilLuas("Segitiga");
		Segitiga segitiga = new Segitiga(4,2);
		System.out.println(segitiga .luasSegitiga());
		tampil.TampilKeliling("Segitiga");
		System.out.println(segitiga .kelilingSegitiga());
	}
}