public class Desk {
	int x; //인스턴스변수
	static int y; //클래스변수
	
	{ //A -> 인스턴스 초기화 블럭, new할때마다 실행, 생성자가 그 역할을 함
		for(int i=0;i<10;i++){
			x++;
		}
	}
	
	
	static { //B -> static초기화 블럭, static 영역에 올라왔을 때 동작, 즉 메모리에 로드될때 가장먼저 동작
		for(int i=0;i<20;i++){
			y++;
		}
	}
	                              
	public static void main(String[] args){
		//System.out.println(x); //C -> 에러, 인스턴스가 아직 앖음
		int a=new Desk().x; //D -> 10
		System.out.println(a); //E -> 10
		System.out.println(y); //F -> 20
		
	}
}
