class Dog{
	String name="뽀미";
	static int age=9;

	public static void main(String[] args){
		/*
		Dog d1=new Dog();
		Dog d2=new Dog();

		d1.age=6;
		System.out.println(d2); //이렇게 찍으면 레퍼런스변수(reference), 즉 주소값이 출력됨
		*/
		System.out.println(age); //클래스 변수이기 때문 Dog.age로 접근해도되지만 age로 접근해도 됨
		//메인메서드도 age변수도 둘다 static의 영역이기에
	}
}