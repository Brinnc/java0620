public class Desk {
	int x; //�ν��Ͻ�����
	static int y; //Ŭ��������
	
	{ //A -> �ν��Ͻ� �ʱ�ȭ ��, new�Ҷ����� ����, �����ڰ� �� ������ ��
		for(int i=0;i<10;i++){
			x++;
		}
	}
	
	
	static { //B -> static�ʱ�ȭ ��, static ������ �ö���� �� ����, �� �޸𸮿� �ε�ɶ� ������� ����
		for(int i=0;i<20;i++){
			y++;
		}
	}
	                              
	public static void main(String[] args){
		//System.out.println(x); //C -> ����, �ν��Ͻ��� ���� ����
		int a=new Desk().x; //D -> 10
		System.out.println(a); //E -> 10
		System.out.println(y); //F -> 20
		
	}
}
