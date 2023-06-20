public class Flower {
	int leaf=10; //A
	static int height=30; //B
	
	public void grow(){;//C
		int h=5;
	}
	
	public static void main(String[] args){
	       height=20;//D
		
		Flower f1 = new Flower();
		Flower f2 = new Flower();
		
		f2.height=100; //E 
		System.out.println(height); //F
		System.out.println(f1.height);
	}
} 
