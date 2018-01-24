class BindingTest3{
	public static void main(String[] args) {
		Parent5 p = new Child5();		//parent의 객체를 생성했지만 new Child5로 불렀으므로 parent의 메서드는 오버라이딩 되서 사라짐.
										//변수를 부를때는 parent5의 변수를 부름, 그냥 x값은 100, 메서드로 부를때는 child의 메서드를 부르게됨.
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
		System.out.println("x=" + x);  // this.x와 같다.
		System.out.println("super.x=" + super.x); //상위 상속자니까 super.x= parent5의 x값, 100 
		System.out.println("this.x="  + this.x); //=> this는 '나'니까 child5의 int x=200; 값
	}
}
