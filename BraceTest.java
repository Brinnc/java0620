class BraceTest{
	//아래의 {}영역은 인스턴스 초기화 블럭임
	//이 블럭은 BraceTest클래스로부터 인스턴스가 생성될때마다 실행됨
	{
		System.out.println("전 인스턴스 초기화 블럭임");
	}

	//클래스가 로드될 떄 실행되는 영역
	//static 초기화 블럭
	//따라서 가장 먼저 실행됨
	//실행이란 코드가 메모리에 올라와야 가능하기 때문에
	//static초기화 블럭이 먼저 동작함
	static{
		System.out.println("저 로드됬어용");
	}

	public static void main(String[] args){

		System.out.println("메인호출");
		new BraceTest();
		new BraceTest();
		new BraceTest();
	}
}