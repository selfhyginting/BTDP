public class Segitiga{
	
	float alas;
	float tinggi;
	
	public Segitiga(float alas, float tinggi){
		this.alas= alas;
		this.tinggi= tinggi;
	}
	
	public float luasSegitiga() {
		float hasil = (this.alas*this.tinggi)/2;
		return hasil;
	}
	
	public float kelilingSegitiga() {
		float hasil = (this.alas*3);
		return hasil;
	}
}