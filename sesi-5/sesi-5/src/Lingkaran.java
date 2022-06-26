public class Lingkaran{
	float jari_jari;
	
	public Lingkaran(float jari_jari){
		this.jari_jari= jari_jari;
	}
	
	public float luasLingkaran() {
		float hasil = this.jari_jari*this.jari_jari*(22/7);
		return hasil;
	}
	
	public float kelilingLingkaran() {
		float hasil = 2*this.jari_jari*(22/7);
		return hasil;
	}
}