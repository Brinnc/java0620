class UseComputer{

	public static void main(String[] args){
		Computer com=new Computer();
		com.setValue("»ï¼º",200);
		int a=com.price; //200
		int b=com.getPrice();//200
		System.out.println("a+b °á°ú´Â "+(a+b)); //400?
	}
}
