public class Persegi{
	float sisi;
	public Persegi(float sisi){
		this.sisi= sisi;
	}
	
	public float luasPersegi() {
		float hasil = this.sisi*this.sisi;
		return hasil;
	}
	
	public float kelilingPersegi() {
		float hasil = this.sisi*4;
		return hasil;
	}
}