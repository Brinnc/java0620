class UseComputer{

	public static void main(String[] args){
		Computer com=new Computer();
		com.setValue("�Ｚ",200);
		int a=com.price; //200
		int b=com.getPrice();//200
		System.out.println("a+b ����� "+(a+b)); //400?
	}
}
