public class PenjumlahanXY {
	public static void main(String[] args) {
		int X1,y1,y2,X2;
		y1 = 0;
		y2 = 0;
		X1 = y1+y2;
		X1 = X1 * X1;
		X2 = (y1 % 4)*y2;
		System.out.println(X1);
		System.out.println(X2);
		
		if (X1>=X2) {
			System.out.println("true");
		}
		
		if (X2>=X1) {
			System.out.println("false");
		}
		
		if (X1 % 4 == (++X2) % 5) {
			System.out.println("true");
		}
	}
}