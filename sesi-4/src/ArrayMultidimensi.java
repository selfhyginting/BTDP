public class ArrayMultidimensi{
	public static void main(String[] args) {
		String[][] framework = {
			{"Java","Kotlin"},
			{"React","Reactnative"},
			{"PHP","Laravel"}
		};
		
		for (int x=0;x<framework.length;x++) {
			System.out.println("bahasa: " +framework[x][0]);

			System.out.println("framework: " +framework[x][1]);
			
			System.out.println("-----------------------");
		}
	}
}