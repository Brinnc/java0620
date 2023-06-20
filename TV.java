class  TV{
	String color="black";
	String company="LG";
	int weight=45;

	public void setColor(String c){
		color=c;
	}

	public static void main(String[] args){
		//weight=30;  
		new TV(); 
		String color="blue"; 
		System.out.println(color);  
		int w=new TV().weight;  
		System.out.println("¹«°Ô´Â "+w); 
	}
}
