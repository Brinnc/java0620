class BraceTest{
	//�Ʒ��� {}������ �ν��Ͻ� �ʱ�ȭ ����
	//�� ���� BraceTestŬ�����κ��� �ν��Ͻ��� �����ɶ����� �����
	{
		System.out.println("�� �ν��Ͻ� �ʱ�ȭ ����");
	}

	//Ŭ������ �ε�� �� ����Ǵ� ����
	//static �ʱ�ȭ ��
	//���� ���� ���� �����
	//�����̶� �ڵ尡 �޸𸮿� �ö�;� �����ϱ� ������
	//static�ʱ�ȭ ���� ���� ������
	static{
		System.out.println("�� �ε����");
	}

	public static void main(String[] args){

		System.out.println("����ȣ��");
		new BraceTest();
		new BraceTest();
		new BraceTest();
	}
}