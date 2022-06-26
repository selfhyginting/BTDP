public class Makanan{
	public static void main(String[] args) {
		
		Restaurant data = new Restaurant();
		
		data.setMenu("Ayam Goreng");
		data.setHarga(17000);
		data.setSpesial(true);
		
		System.out.println("Menu Makanan : "+data.getMenu());
		System.out.println("Harga Makanan : "+data.getHarga());
		System.out.println("Menu Spesial : "+data.getSpesial());
	}
}