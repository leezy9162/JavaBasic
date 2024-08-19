package day09.pkg1;

public class B{
	//no inheritance
	
	//같은 패키지, 접근 가능
	public void method() {
		A a  = new A();
		a.field = "value";
		a.method();
	}
	
	
}
