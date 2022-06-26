public class PersegiPanjang{
	
	float panjang;
	float lebar;
	
	public PersegiPanjang(float panjang, float lebar){
		this.panjang= panjang;
		this.lebar = lebar;
	}
	
	public float luasPersegiPanjang() {
		float hasil = this.panjang*this.lebar;
		return hasil;
	}
	
	public float kelilingPersegiPanjang() {
		float hasil = 2*(this.panjang+this.lebar);
		return hasil;
	}
}