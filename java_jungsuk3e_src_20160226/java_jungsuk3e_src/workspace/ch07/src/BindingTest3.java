class BindingTest3{
	public static void main(String[] args) {
		Parent5 p = new Child5();		//parent�� ��ü�� ���������� new Child5�� �ҷ����Ƿ� parent�� �޼���� �������̵� �Ǽ� �����.
										//������ �θ����� parent5�� ������ �θ�, �׳� x���� 100, �޼���� �θ����� child�� �޼��带 �θ��Ե�.
		Child5  c = new Child5();

		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println();
		System.out.println("c.x = " + c.x);
		c.method();
	}
}

class Parent5 {
	int x = 100;

	void method() {
		System.out.println("Parent Method");
	}
}

class Child5 extends Parent5 {
	int x = 200;

	void method() {
		System.out.println("x=" + x);  // this.x�� ����.
		System.out.println("super.x=" + super.x); //���� ����ڴϱ� super.x= parent5�� x��, 100 
		System.out.println("this.x="  + this.x); //=> this�� '��'�ϱ� child5�� int x=200; ��
	}
}
