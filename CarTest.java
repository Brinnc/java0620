public class CarTest {
	int price=100;
	
	public static void main(String[] args) {
		int x=5; //A
		CarTest carTest = new CarTest(); //B
		{
			int y=3; //C
			System.out.println(y);
		}
		//System.out.println(y);//D
		System.out.println(carTest);//E
	}//F
}
